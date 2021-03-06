/** 
 ** Copyright (c) 2010 Ushahidi Inc
 ** All rights reserved
 ** Contact: team@ushahidi.com
 ** Website: http://www.ushahidi.com
 ** 
 ** GNU Lesser General Public License Usage
 ** This file may be used under the terms of the GNU Lesser
 ** General Public License version 3 as published by the Free Software
 ** Foundation and appearing in the file LICENSE.LGPL included in the
 ** packaging of this file. Please review the following information to
 ** ensure the GNU Lesser General Public License version 3 requirements
 ** will be met: http://www.gnu.org/licenses/lgpl.html. 
 ** 
 **
 ** If you have questions regarding the use of this file, please contact
 ** Ushahidi developers at team@ushahidi.com.
 ** 
 **/

package com.ushahidi.android.app.entities;

import com.ushahidi.android.app.models.Model;
import com.ushahidi.java.sdk.api.Category;

public class CategoryEntity extends Model implements IDbEntity {

	private transient int id;
	private String categoryTitle = "";
	private String categoryDescription = "";
	private String categoryColor = "";
	private int categoryPosition = 0;
	private int parentId = 0;
	private int categoryId = 0;

	public void addCategory(Category category) {
		this.setCategoryId(category.getId());
		this.setCategoryColor(category.getColor());
		this.setCategoryDescription(category.getDescription());
		this.setCategoryPosition(category.getPosition());
		this.setParentId(category.getParentId());
		this.setCategoryTitle(category.getTitle());
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String title) {
		this.categoryTitle = title;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String description) {
		this.categoryDescription = description;
	}

	public String getCategoryColor() {
		return categoryColor;
	}

	public void setCategoryColor(String color) {

		if (color.startsWith("#")) {
			this.categoryColor = color;
		} else {
			this.categoryColor = "#" + color;
		}
	}

	public int getCategoryPosition() {
		return categoryPosition;
	}

	public void setCategoryPosition(int position) {
		this.categoryPosition = position;
	}

	@Override
	public void setDbId(int id) {
		this.id = id;
	}

	@Override
	public int getDbId() {
		return id;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getParentId() {
		return this.parentId;
	}

}

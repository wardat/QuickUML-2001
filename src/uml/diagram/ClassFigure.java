/**
 *
    QuickUML; A simple UML tool that demonstrates one use of the 
    Java Diagram Package 

    Copyright (C) 2001  Eric Crahen <crahen@cse.buffalo.edu>

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

 */

package uml.diagram;

import diagram.figures.RectangularFigure;


/**
 * @class ClassFigure
 *
 * @date 08-27-2001
 * @author Eric Crahen
 * @version 1.1
 *
 * Stores the display information for a particular ClassItem
 */
public class ClassFigure extends RectangularFigure {

  private int lastDividerLocation = -1;

  public ClassFigure() {
    super(100,75);
  }
 
  public int getDividerLocation() {
    return lastDividerLocation;
  }

  public void setDividerLocation(int lastDividerLocation) {
    this.lastDividerLocation = lastDividerLocation;
  }

}

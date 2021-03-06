/*************************************************************************

Copyright (C) 2008 Grandite

This file is part of Open ModelSphere.

Open ModelSphere is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
or see http://www.gnu.org/licenses/.

You can reach Grandite at: 

20-1220 Lebourgneuf Blvd.
Quebec, QC
Canada  G2K 2G4

or

open-modelsphere@grandite.com

 **********************************************************************/

package org.modelsphere.sms.plugins.report.model;

// Jack
import org.modelsphere.jack.baseDb.db.srtypes.DbtAbstract;
import org.modelsphere.jack.baseDb.db.srtypes.Domain;
import org.modelsphere.jack.baseDb.db.srtypes.IntDomain;
import org.modelsphere.sms.plugins.report.LocaleMgr;

// Sms

public class ColumnHorizontalAlignmentDomain extends IntDomain {

    static final long serialVersionUID = 0;

    public static final int NULL = 1;
    public static final int CENTER = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;

    public static final ColumnHorizontalAlignmentDomain[] objectPossibleValues = new ColumnHorizontalAlignmentDomain[] {
            new ColumnHorizontalAlignmentDomain(NULL), new ColumnHorizontalAlignmentDomain(CENTER),
            new ColumnHorizontalAlignmentDomain(LEFT), new ColumnHorizontalAlignmentDomain(RIGHT) };

    public static final String[] stringPossibleValues = new String[] { "",
            LocaleMgr.misc.getString("center"), LocaleMgr.misc.getString("left"),
            LocaleMgr.misc.getString("right") };

    public static ColumnHorizontalAlignmentDomain getInstance(int value) {
        return objectPossibleValues[objectPossibleValues[0].indexOf(value)];
    }

    protected ColumnHorizontalAlignmentDomain(int value) {
        super(value);
    }

    public final DbtAbstract duplicate() {
        return new ColumnHorizontalAlignmentDomain(value);
    }

    public final Domain[] getObjectPossibleValues() {
        return objectPossibleValues;
    }

    public final String[] getStringPossibleValues() {
        return stringPossibleValues;
    }

    public final String getStringValue() {
        String key;
        switch (value) {
        case CENTER:
            key = "CENTER";
            break;
        case RIGHT:
            key = "RIGHT";
            break;
        case LEFT:
            key = "LEFT";
            break;
        default:
            key = "";
        }
        return key;
    }
}

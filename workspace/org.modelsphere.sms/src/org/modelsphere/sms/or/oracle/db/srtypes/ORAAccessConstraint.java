/*************************************************************************

Copyright (C) 2009 Grandite

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

You can redistribute and/or modify this particular file even under the
terms of the GNU Lesser General Public License (LGPL) as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

You should have received a copy of the GNU Lesser General Public License 
(LGPL) along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
or see http://www.gnu.org/licenses/.

You can reach Grandite at: 

20-1220 Lebourgneuf Blvd.
Quebec, QC
Canada  G2K 2G4

or

open-modelsphere@grandite.com

 **********************************************************************/
// Possible Values :
// NO READ
// NO WRITE
// NO READ/WRITE
package org.modelsphere.sms.or.oracle.db.srtypes;

import org.modelsphere.jack.baseDb.db.srtypes.*;
import org.modelsphere.sms.or.oracle.international.LocaleMgr;

public class ORAAccessConstraint extends IntDomain {

    static final long serialVersionUID = 0;

    public static final int NOREAD = 1;
    public static final int NOWRITE = 2;
    public static final int NOREADWRITE = 3;

    public static final ORAAccessConstraint[] objectPossibleValues = new ORAAccessConstraint[] {
            new ORAAccessConstraint(NOREAD), new ORAAccessConstraint(NOWRITE),
            new ORAAccessConstraint(NOREADWRITE) };

    public static final String[] stringPossibleValues = new String[] {
            LocaleMgr.misc.getString("noread"), LocaleMgr.misc.getString("nowrite"),
            LocaleMgr.misc.getString("noreadwrite") };

    public static ORAAccessConstraint getInstance(int value) {
        return objectPossibleValues[objectPossibleValues[0].indexOf(value)];
    }

    protected ORAAccessConstraint(int value) {
        super(value);
    }

    //Parameterless constructor
    public ORAAccessConstraint() {
    }

    public final DbtAbstract duplicate() {
        return new ORAAccessConstraint(value);
    }

    public final Domain[] getObjectPossibleValues() {
        return objectPossibleValues;
    }

    public final String[] getStringPossibleValues() {
        return stringPossibleValues;
    }

    public String getStringForNullValue() {
        return org.modelsphere.jack.baseDb.screen.DefaultRenderer.kUnspecified;
    }
}

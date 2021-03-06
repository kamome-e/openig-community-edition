/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions Copyrighted [year] [name of copyright owner]".
 *
 * Copyright © 2009 Sun Microsystems Inc. All rights reserved.
 * Portions Copyrighted 2010–2011 ApexIdentity Inc.
 * Portions Copyrighted 2011 ForgeRock AS.
 */

package org.forgerock.openig.http;

// Java Standard Edition
import java.util.List;

// OpenIG Core
import org.forgerock.openig.util.CaseInsensitiveMap;
import org.forgerock.openig.util.MultiValueMap;

/**
 * Message headers, a case-insensitive multiple-value map.
 *
 * @author Paul C. Bryan
 */
public class Headers extends MultiValueMap<String, String> {

    /**
     * Constructs a new instance of message headers.
     */
    public Headers() {
        super(new CaseInsensitiveMap<List<String>>());
    }
}

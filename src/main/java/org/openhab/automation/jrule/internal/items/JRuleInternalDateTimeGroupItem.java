/**
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.automation.jrule.internal.items;

import java.util.List;
import java.util.Map;

import org.openhab.automation.jrule.items.JRuleDateTimeGroupItem;
import org.openhab.automation.jrule.items.metadata.JRuleItemMetadata;

/**
 * The {@link JRuleInternalDateTimeGroupItem} Items
 *
 * @author Arne Seime - Initial contribution
 */
public class JRuleInternalDateTimeGroupItem extends JRuleInternalDateTimeItem implements JRuleDateTimeGroupItem {

    public JRuleInternalDateTimeGroupItem(String name, String label, String type, String id,
            Map<String, JRuleItemMetadata> metadata, List<String> tags) {
        super(name, label, type, id, metadata, tags);
    }
}

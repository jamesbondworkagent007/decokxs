package j$.time;

import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import java.util.Objects;
import o.yCH;

/* JADX INFO: loaded from: classes13.dex */
final class ZoneRegion extends ZoneId {
    private final String id;
    private final transient ZoneRules rules;

    @Override // j$.time.ZoneId
    public ZoneRules getRules() {
        ZoneRules zoneRules = this.rules;
        return zoneRules != null ? zoneRules : yCH.KWHzl(this.id, false);
    }

    @Override // j$.time.ZoneId
    public String getId() {
        return this.id;
    }

    static ZoneRegion ofId(String str, boolean z) {
        ZoneRules zoneRulesKWHzl;
        Objects.requireNonNull(str, "zoneId");
        checkName(str);
        try {
            zoneRulesKWHzl = yCH.KWHzl(str, true);
        } catch (ZoneRulesException e) {
            if (z) {
                throw e;
            }
            zoneRulesKWHzl = null;
        }
        return new ZoneRegion(str, zoneRulesKWHzl);
    }

    private static void checkName(String str) {
        int length = str.length();
        if (length < 2) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
            }
        }
    }

    ZoneRegion(String str, ZoneRules zoneRules) {
        this.id = str;
        this.rules = zoneRules;
    }
}

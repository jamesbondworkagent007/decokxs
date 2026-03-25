package o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yCH {
    private static final ConcurrentMap KWHzl;
    private static final CopyOnWriteArrayList OLrzqt;

    protected abstract java.util.Set KWHzl();

    protected abstract ZoneRules copydefault(java.lang.String str, boolean z);

    private static void EZpvd(yCH ych) {
        for (java.lang.String str : ych.KWHzl()) {
            Objects.requireNonNull(str, "zoneId");
            if (((yCH) KWHzl.putIfAbsent(str, ych)) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + ych);
            }
        }
    }

    public static void copydefault(yCH ych) {
        Objects.requireNonNull(ych, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        EZpvd(ych);
        OLrzqt.add(ych);
    }

    public static ZoneRules KWHzl(java.lang.String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        return KWHzl(str).copydefault(str, z);
    }

    /* JADX INFO: loaded from: classes17.dex */
    static final class TaskDescription extends yCH {
        private final java.util.Set KWHzl;

        @Override // o.yCH
        protected java.util.Set KWHzl() {
            return this.KWHzl;
        }

        @Override // o.yCH
        protected ZoneRules copydefault(java.lang.String str, boolean z) {
            if (this.KWHzl.contains(str)) {
                return new ZoneRules(TimeZone.getTimeZone(str));
            }
            throw new ZoneRulesException("Not a built-in time zone: " + str);
        }

        TaskDescription() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (java.lang.String str : TimeZone.getAvailableIDs()) {
                linkedHashSet.add(str);
            }
            this.KWHzl = Collections.unmodifiableSet(linkedHashSet);
        }
    }

    private static yCH KWHzl(java.lang.String str) {
        ConcurrentMap concurrentMap = KWHzl;
        yCH ych = (yCH) concurrentMap.get(str);
        if (ych != null) {
            return ych;
        }
        if (concurrentMap.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    public static java.util.Set EZpvd() {
        return new java.util.HashSet(KWHzl.keySet());
    }

    protected yCH() {
    }

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        OLrzqt = copyOnWriteArrayList;
        KWHzl = new ConcurrentHashMap(512, 0.75f, 2);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        AccessController.doPrivileged(new PrivilegedAction() { // from class: o.yCH.4
            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                java.lang.String property = java.lang.System.getProperty("java.time.zone.DefaultZoneRulesProvider");
                if (property == null) {
                    yCH.copydefault(new TaskDescription());
                    return null;
                }
                try {
                    yCH ych = (yCH) yCH.class.cast(java.lang.Class.forName(property, true, yCH.class.getClassLoader()).newInstance());
                    yCH.copydefault(ych);
                    arrayList.add(ych);
                    return null;
                } catch (java.lang.Exception e) {
                    throw new java.lang.Error(e);
                }
            }
        });
        copyOnWriteArrayList.addAll(arrayList);
    }
}

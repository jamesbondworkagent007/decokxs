package com.okinc.components.track;

import com.okinc.components.track.amplitude.AmplitudeName;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32804mkW;
import o.C32864mld;
import o.C32902mmO;
import o.C32909mmV;
import o.C32918mme;
import o.C56444yFp;
import o.InterfaceC32861mla;
import o.InterfaceC32926mmm;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ABTestManager {
    public static final ABTestManager AEQbTJ = new ABTestManager();

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CacheType.values().length];
            try {
                iArr[CacheType.Latest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheType.Session.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getValue$default(this, str, null, 2, null);
    }

    private ABTestManager() {
    }

    public static /* synthetic */ String getValue$default(ABTestManager aBTestManager, String str, AmplitudeName amplitudeName, int i, Object obj) {
        if ((i & 2) != 0) {
            amplitudeName = C32804mkW.EZpvd();
        }
        return aBTestManager.AEQbTJ(str, amplitudeName);
    }

    public final String AEQbTJ(@NotNull String str, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        String strEZpvd = C32918mme.copydefault.EZpvd(str, amplitudeName);
        if (strEZpvd == null) {
            strEZpvd = C32909mmV.KWHzl.KWHzl(ABTestProvider.BYTEDANCE).EZpvd(str, amplitudeName);
        }
        if (strEZpvd == null) {
            strEZpvd = C32909mmV.KWHzl.KWHzl(ABTestProvider.SKYLAB).EZpvd(str, amplitudeName);
        }
        C32909mmV.KWHzl.OLrzqt(str, strEZpvd);
        pUU.EZpvd("ABTestManager", "getValue    [latest] " + str + " -> " + strEZpvd);
        return strEZpvd;
    }

    public static /* synthetic */ String getValue$default(ABTestManager aBTestManager, String str, AmplitudeName amplitudeName, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            amplitudeName = C32804mkW.EZpvd();
        }
        return aBTestManager.copydefault(str, amplitudeName, str2);
    }

    public final String copydefault(@NotNull String str, @NotNull AmplitudeName amplitudeName, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Function0<Boolean> function0Values = C32864mld.OLrzqt.values();
        return (function0Values == null || !function0Values.invoke().booleanValue()) ? AEQbTJ(str, amplitudeName) : str2;
    }

    public static /* synthetic */ Object getPayload$default(ABTestManager aBTestManager, String str, AmplitudeName amplitudeName, int i, Object obj) {
        if ((i & 2) != 0) {
            amplitudeName = C32804mkW.EZpvd();
        }
        return aBTestManager.KWHzl(str, amplitudeName);
    }

    public final Object KWHzl(@NotNull String str, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Object objCopydefault = C32918mme.copydefault.copydefault(str, amplitudeName);
        if (objCopydefault == null) {
            objCopydefault = C32909mmV.KWHzl.KWHzl(ABTestProvider.BYTEDANCE).AEQbTJ(str, amplitudeName);
        }
        if (objCopydefault == null) {
            objCopydefault = C32909mmV.KWHzl.KWHzl(ABTestProvider.SKYLAB).AEQbTJ(str, amplitudeName);
        }
        C32909mmV.KWHzl.OLrzqt(str, String.valueOf(objCopydefault));
        pUU.EZpvd("ABTestManager", "getPayload  [latest] " + str + " -> " + objCopydefault);
        return objCopydefault;
    }

    public static /* synthetic */ Object getPayload$default(ABTestManager aBTestManager, String str, AmplitudeName amplitudeName, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            amplitudeName = C32804mkW.EZpvd();
        }
        return aBTestManager.copydefault(str, amplitudeName, obj);
    }

    public final Object copydefault(@NotNull String str, @NotNull AmplitudeName amplitudeName, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Function0<Boolean> function0Values = C32864mld.OLrzqt.values();
        return (function0Values == null || !function0Values.invoke().booleanValue()) ? KWHzl(str, amplitudeName) : obj;
    }

    public final Object copydefault(@NotNull String str, @NotNull AmplitudeName amplitudeName, @NotNull CacheType cacheType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Intrinsics.checkNotNullParameter(cacheType, "");
        int i = Application.OLrzqt[cacheType.ordinal()];
        if (i == 1) {
            return KWHzl(str, amplitudeName);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        C32918mme c32918mme = C32918mme.copydefault;
        Boolean boolValueOf = Boolean.valueOf(c32918mme.copydefault(amplitudeName, str));
        if (!boolValueOf.booleanValue()) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            boolValueOf.booleanValue();
            Object objEZpvd = c32918mme.EZpvd(amplitudeName, str);
            if (objEZpvd != null) {
                return objEZpvd;
            }
        }
        Object objKWHzl = KWHzl(str, amplitudeName);
        if (objKWHzl == null) {
            return null;
        }
        pUU.EZpvd("ABTestManager", "savePayload [cached] " + str + " -> " + objKWHzl);
        c32918mme.AEQbTJ(amplitudeName, str, objKWHzl);
        return objKWHzl;
    }

    public static /* synthetic */ boolean isEnabled$default(ABTestManager aBTestManager, InterfaceC32926mmm interfaceC32926mmm, AmplitudeName amplitudeName, int i, Object obj) {
        if ((i & 2) != 0) {
            amplitudeName = C32804mkW.EZpvd();
        }
        return aBTestManager.KWHzl(interfaceC32926mmm, amplitudeName);
    }

    public final <T extends InterfaceC32926mmm> boolean KWHzl(@NotNull T t, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        return t.OLrzqt(AEQbTJ(t.EZpvd(), amplitudeName));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mkW.AEQbTJ():com.okinc.components.track.ABTestProvider */
    public static /* synthetic */ void registerCallback$default(ABTestManager aBTestManager, InterfaceC32861mla interfaceC32861mla, AmplitudeName amplitudeName, ABTestProvider aBTestProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            amplitudeName = C32804mkW.EZpvd();
        }
        if ((i & 4) != 0) {
            aBTestProvider = C32804mkW.AEQbTJ;
        }
        aBTestManager.EZpvd(interfaceC32861mla, amplitudeName, aBTestProvider);
    }

    public final void EZpvd(@NotNull InterfaceC32861mla interfaceC32861mla, @NotNull AmplitudeName amplitudeName, @NotNull ABTestProvider aBTestProvider) {
        Intrinsics.checkNotNullParameter(interfaceC32861mla, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Intrinsics.checkNotNullParameter(aBTestProvider, "");
        C32909mmV.KWHzl.KWHzl(aBTestProvider).OLrzqt(interfaceC32861mla, amplitudeName);
    }

    public static /* synthetic */ void registerCallback$default(ABTestManager aBTestManager, InterfaceC32861mla interfaceC32861mla, AmplitudeName amplitudeName, int i, Object obj) {
        if ((i & 2) != 0) {
            amplitudeName = C32804mkW.EZpvd();
        }
        aBTestManager.KWHzl(interfaceC32861mla, amplitudeName);
    }

    public final void KWHzl(@NotNull InterfaceC32861mla interfaceC32861mla, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(interfaceC32861mla, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Iterator<ABTestProvider> it = ABTestProvider.getEntries().iterator();
        while (it.hasNext()) {
            C32909mmV.KWHzl.KWHzl(it.next()).OLrzqt(interfaceC32861mla, amplitudeName);
        }
    }

    public static /* synthetic */ void unRegisterCallback$default(ABTestManager aBTestManager, InterfaceC32861mla interfaceC32861mla, AmplitudeName amplitudeName, ABTestProvider aBTestProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            amplitudeName = C32804mkW.EZpvd();
        }
        if ((i & 4) != 0) {
            aBTestProvider = C32804mkW.AEQbTJ;
        }
        aBTestManager.copydefault(interfaceC32861mla, amplitudeName, aBTestProvider);
    }

    public final void copydefault(@NotNull InterfaceC32861mla interfaceC32861mla, @NotNull AmplitudeName amplitudeName, @NotNull ABTestProvider aBTestProvider) {
        Intrinsics.checkNotNullParameter(interfaceC32861mla, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Intrinsics.checkNotNullParameter(aBTestProvider, "");
        C32909mmV.KWHzl.KWHzl(aBTestProvider).EZpvd(interfaceC32861mla, amplitudeName);
    }

    public static /* synthetic */ void unRegisterCallback$default(ABTestManager aBTestManager, InterfaceC32861mla interfaceC32861mla, AmplitudeName amplitudeName, int i, Object obj) {
        if ((i & 2) != 0) {
            amplitudeName = C32804mkW.EZpvd();
        }
        aBTestManager.EZpvd(interfaceC32861mla, amplitudeName);
    }

    public final void EZpvd(@NotNull InterfaceC32861mla interfaceC32861mla, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(interfaceC32861mla, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        Iterator<ABTestProvider> it = ABTestProvider.getEntries().iterator();
        while (it.hasNext()) {
            C32909mmV.KWHzl.KWHzl(it.next()).EZpvd(interfaceC32861mla, amplitudeName);
        }
    }

    public static /* synthetic */ void refreshCefiFlagsWithLoginChange$default(ABTestManager aBTestManager, String str, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 2000;
        }
        aBTestManager.OLrzqt(str, j, function1);
    }

    public final void OLrzqt(@NotNull String str, long j, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C32902mmO.KWHzl.KWHzl(str, j, function1);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CacheType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CacheType[] $VALUES;
        public static final CacheType Latest = new CacheType("Latest", 0);
        public static final CacheType Session = new CacheType("Session", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CacheType[] $values() {
            return new CacheType[]{Latest, Session};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CacheType> getEntries() {
            return $ENTRIES;
        }

        private CacheType(String str, int i) {
        }

        static {
            CacheType[] cacheTypeArr$values = $values();
            $VALUES = cacheTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(cacheTypeArr$values);
        }

        public static CacheType valueOf(String str) {
            return (CacheType) Enum.valueOf(CacheType.class, str);
        }

        public static CacheType[] values() {
            return (CacheType[]) $VALUES.clone();
        }
    }
}

package com.okinc.okpush.sdk.config;

import android.app.Application;
import android.content.Context;
import com.okinc.okpush.sdk.config.OKPushConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C34703nhO;
import o.C43252rll;
import o.C46939tgd;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC43299rmf;
import o.InterfaceC56445yFq;
import o.mMP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OKPushConfig {
    public static boolean AhwBna;
    public static boolean EZpvd;
    public static Application OLrzqt;
    public static boolean djBIcL;
    public static Function1<? super String, Unit> gEmmrt;
    public static final OKPushConfig copydefault = new OKPushConfig();
    public static Function0<? extends AppType> AEQbTJ = new Function0() { // from class: o.tgm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKPushConfig.OLrzqt();
        }
    };
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<String, Unit> AYXKKw() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super String, Unit> function1) {
        gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return AhwBna;
    }

    private OKPushConfig() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AppType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AppType[] $VALUES;
        public static final AppType OKEX_GP = new AppType("OKEX_GP", 0);
        public static final AppType OKEX_CN = new AppType("OKEX_CN", 1);
        public static final AppType OKCOIN = new AppType("OKCOIN", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AppType[] $values() {
            return new AppType[]{OKEX_GP, OKEX_CN, OKCOIN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AppType> getEntries() {
            return $ENTRIES;
        }

        private AppType(String str, int i) {
        }

        static {
            AppType[] appTypeArr$values = $values();
            $VALUES = appTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(appTypeArr$values);
        }

        public static AppType valueOf(String str) {
            return (AppType) Enum.valueOf(AppType.class, str);
        }

        public static AppType[] values() {
            return (AppType[]) $VALUES.clone();
        }
    }

    public static final AppType OLrzqt() {
        Application application = OLrzqt;
        if (application == null) {
            Intrinsics.gEmmrt("");
            application = null;
        }
        String strKWHzl = C34703nhO.KWHzl(application);
        Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
        if (StringsKt__StringsKt.contains$default((CharSequence) strKWHzl, (CharSequence) ".gp", false, 2, (Object) null)) {
            return AppType.OKEX_GP;
        }
        return AppType.OKEX_CN;
    }

    public final void OLrzqt(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (!EZpvd || djBIcL) {
            EZpvd = true;
            OLrzqt = application;
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            InterfaceC43299rmf interfaceC43299rmfOLrzqt = C43252rll.OLrzqt(application, "OKPush");
            if (interfaceC43299rmfOLrzqt != null) {
                interfaceC43299rmfOLrzqt.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.tgo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return OKPushConfig.EZpvd();
                    }
                }));
            }
        }
    }

    public static final C46939tgd EZpvd() {
        return new C46939tgd();
    }

    public final Context copydefault() {
        Application application = OLrzqt;
        if (application != null) {
            return application;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean AhwBna() {
        return AEQbTJ.invoke() == AppType.OKEX_GP;
    }

    public final String valueOf() {
        return C34703nhO.AEQbTJ() ? "1fa4d07b-c7f9-406f-b4f1-3fd5885bdbed" : C34703nhO.copydefault() ? AhwBna ? "a56974ad-b94f-461d-8b62-c0bbb16714d3" : "db4fb230-7c2f-4dad-9383-0a744630c509" : AhwBna ? "14185bb1-f28d-4af0-a293-6cbcf80cc8c4" : "fb9b4bae-50b8-4129-8ec5-a87251b28517";
    }
}

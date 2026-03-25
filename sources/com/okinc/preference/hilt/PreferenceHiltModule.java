package com.okinc.preference.hilt;

import com.okinc.localization2.bean.LangChangeConfig;
import com.okinc.localization2.bean.LanguagePackConfig;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AXZ;
import o.BnI;
import o.C33492mxV;
import o.C43251rlk;
import o.C46579tZo;
import o.C4663Bmk;
import o.C4695Bnp;
import o.C4718Bol;
import o.InterfaceC46550tYm;
import o.pTU;
import o.pUU;
import org.jetbrains.annotations.NotNull;
import uniffi.settings.DayNightMode;

/* JADX INFO: loaded from: classes10.dex */
public final class PreferenceHiltModule {
    public final InterfaceC46550tYm EZpvd() {
        return (InterfaceC46550tYm) C43251rlk.copydefault(InterfaceC46550tYm.class);
    }

    public static final class Activity implements BnI {
        public final /* synthetic */ pTU AEQbTJ;

        public Activity(pTU ptu) {
            this.AEQbTJ = ptu;
        }

        @Override // o.BnI
        public Object EZpvd(AXZ axz, Continuation<? super Boolean> continuation) {
            return this.AEQbTJ.OLrzqt(new LanguageUnit(axz.EZpvd(), axz.copydefault()), new LangChangeConfig(null, LanguagePackConfig.CACHE_OR_LATEST_OR_EMBEDDED, null, false, 13, null), continuation);
        }
    }

    public final C4718Bol copydefault(@NotNull pTU ptu) {
        Intrinsics.checkNotNullParameter(ptu, "");
        return new C4718Bol(new Activity(ptu));
    }

    public final C4663Bmk OLrzqt() {
        return new C4663Bmk(new C46579tZo());
    }

    public final C4695Bnp copydefault() {
        DayNightMode dayNightMode;
        int iEZpvd = C33492mxV.EZpvd();
        if (iEZpvd == -1) {
            dayNightMode = DayNightMode.AUTO;
        } else if (iEZpvd == 1) {
            dayNightMode = DayNightMode.DAY;
        } else if (iEZpvd == 2) {
            dayNightMode = DayNightMode.NIGHT;
        } else {
            pUU.KWHzl("DayNightMode", "not expected input: " + iEZpvd);
            dayNightMode = DayNightMode.AUTO;
        }
        return new C4695Bnp(dayNightMode);
    }
}

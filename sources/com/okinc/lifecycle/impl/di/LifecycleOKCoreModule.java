package com.okinc.lifecycle.impl.di;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.lifecycle.impl.di.LifecycleOKCoreModule;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ATC;
import o.ATM;
import o.AUI;
import o.C2631ATe;
import o.C2660AUh;
import o.C38107pMm;
import o.C38109pMo;
import o.C38167pOs;
import o.C38171pOw;
import o.C38174pOz;
import o.C43239rlY;
import o.InterfaceC33171mrS;
import o.InterfaceC33253msv;
import o.InterfaceC38101pMg;
import o.InterfaceC38113pMs;
import o.InterfaceC38118pMx;
import o.InterfaceC38120pMz;
import o.InterfaceC43294rma;
import o.kOG;
import o.pKD;
import o.pKI;
import o.pLE;
import o.pLH;
import o.pMA;
import o.pMD;
import o.pMH;
import o.pMI;
import o.pMM;
import o.pMP;
import o.pMS;
import o.pMW;
import o.pMX;
import o.pMZ;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LifecycleOKCoreModule {
    public final ATM copydefault() {
        return new ATM();
    }

    public final C2660AUh EZpvd() {
        return new C2660AUh();
    }

    @yCR
    public final AUI copydefault(@NotNull InterfaceC38113pMs interfaceC38113pMs, @NotNull pMA pma, @NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull pMM pmm, @NotNull InterfaceC33253msv interfaceC33253msv, @NotNull kOG kog, pKI pki) {
        Intrinsics.checkNotNullParameter(interfaceC38113pMs, "");
        Intrinsics.checkNotNullParameter(pma, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        Intrinsics.checkNotNullParameter(interfaceC33253msv, "");
        Intrinsics.checkNotNullParameter(kog, "");
        return new pMZ(interfaceC38113pMs, pma, oKComplianceRestrictionService, interfaceC33171mrS, pmm, interfaceC33253msv, kog, pki, new Function2() { // from class: o.pNp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(LifecycleOKCoreModule.AEQbTJ((android.content.Context) obj, (java.lang.String) obj2));
            }
        });
    }

    public static final boolean AEQbTJ(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @yCR
    public final InterfaceC38120pMz EZpvd(@NotNull pMX pmx, @NotNull pLH plh) {
        Intrinsics.checkNotNullParameter(pmx, "");
        Intrinsics.checkNotNullParameter(plh, "");
        return new pMD(pmx, plh);
    }

    @yCR
    public final pKD AEQbTJ(@NotNull pMI pmi, @NotNull pMH pmh, @NotNull AUI aui, @NotNull InterfaceC38120pMz interfaceC38120pMz) {
        Intrinsics.checkNotNullParameter(pmi, "");
        Intrinsics.checkNotNullParameter(pmh, "");
        Intrinsics.checkNotNullParameter(aui, "");
        Intrinsics.checkNotNullParameter(interfaceC38120pMz, "");
        if (C38174pOz.copydefault.EZpvd()) {
            return new C38167pOs(new ATC(aui), interfaceC38120pMz);
        }
        return new C38171pOw(pmi, pmh, interfaceC38120pMz);
    }

    @yCR
    public final InterfaceC43294rma copydefault(@NotNull pLE ple, @NotNull InterfaceC38101pMg interfaceC38101pMg, @NotNull InterfaceC38118pMx interfaceC38118pMx, @NotNull pMM pmm, @NotNull AUI aui) {
        Intrinsics.checkNotNullParameter(ple, "");
        Intrinsics.checkNotNullParameter(interfaceC38101pMg, "");
        Intrinsics.checkNotNullParameter(interfaceC38118pMx, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        Intrinsics.checkNotNullParameter(aui, "");
        if (C38174pOz.copydefault.EZpvd()) {
            pMW pmw = new pMW(pmm);
            C43239rlY c43239rlY = C43239rlY.AEQbTJ;
            return new C38109pMo(new C2631ATe(aui, pmw, new pMS(c43239rlY, pmm), new pMP(c43239rlY, pmm)));
        }
        return new C38107pMm(ple, interfaceC38101pMg, interfaceC38118pMx, pmm);
    }
}

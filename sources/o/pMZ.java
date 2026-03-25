package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.lifecycle.impl.deeplink.wrapper.core.CoreLinkDependencyHelperImpl$invokeLink$1$execute$2;
import com.okinc.lifecycle.impl.deeplink.wrapper.core.CoreLinkDependencyHelperImpl$performAuth$1$execute$2;
import com.okinc.lifecycle.impl.deeplink.wrapper.core.CoreLinkDependencyHelperImpl$switchModeIfRequired$1$execute$2;
import com.okinc.lifecycle.impl.deeplink.wrapper.core.CoreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pMZ implements AUI {
    public final pMM AEQbTJ;
    public final InterfaceC33171mrS AYXKKw;
    public final pKI AhwBna;
    public final InterfaceC38113pMs EZpvd;
    public final java.lang.String KWHzl;
    public final OKComplianceRestrictionService OLrzqt;
    public final InterfaceC33253msv copydefault;
    public final pMA djBIcL;
    public final kOG gEmmrt;
    public final Function2<android.content.Context, java.lang.String, java.lang.Boolean> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function2<? super android.content.Context, ? super java.lang.String, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public pMZ(@NotNull InterfaceC38113pMs interfaceC38113pMs, @NotNull pMA pma, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull pMM pmm, @NotNull InterfaceC33253msv interfaceC33253msv, @NotNull kOG kog, pKI pki, @NotNull Function2<? super android.content.Context, ? super java.lang.String, java.lang.Boolean> function2) {
        Intrinsics.checkNotNullParameter(interfaceC38113pMs, "");
        Intrinsics.checkNotNullParameter(pma, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        Intrinsics.checkNotNullParameter(interfaceC33253msv, "");
        Intrinsics.checkNotNullParameter(kog, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = interfaceC38113pMs;
        this.djBIcL = pma;
        this.OLrzqt = oKComplianceRestrictionService;
        this.AYXKKw = interfaceC33171mrS;
        this.AEQbTJ = pmm;
        this.copydefault = interfaceC33253msv;
        this.gEmmrt = kog;
        this.AhwBna = pki;
        this.valueOf = function2;
        this.KWHzl = C56524yIo.AEQbTJ(pMZ.class).valueOf();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription implements InterfaceC2699AVv {
        public final /* synthetic */ boolean KWHzl;

        public TaskDescription(boolean z) {
            this.KWHzl = z;
        }

        @Override // o.InterfaceC2699AVv
        public java.lang.Object OLrzqt(Continuation<? super java.lang.Boolean> continuation) {
            return BuildersKt.withContext(Dispatchers.getMain(), new CoreLinkDependencyHelperImpl$performAuth$1$execute$2(pMZ.this, this.KWHzl, null), continuation);
        }

        @Override // o.InterfaceC2699AVv
        public void EZpvd() {
            pUU.copydefault(pMZ.this.KWHzl, "performAuth cancelled");
        }
    }

    @Override // o.AUI
    public InterfaceC2699AVv copydefault(boolean z) {
        return new TaskDescription(z);
    }

    @Override // o.AUI
    public boolean EZpvd() {
        return this.AYXKKw.getFieldNames();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7.equals("metax") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r7.equals("wallet") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        return com.okinc.modular.deeplinkv2.DeeplinkMode.WALLET.getMode();
     */
    @Override // o.AUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        DeeplinkMode deeplinkMode;
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != -795192327) {
            if (iHashCode != 103787283) {
                if (iHashCode == 1989774883 && str.equals("exchange")) {
                    boolean zAEQbTJ = this.OLrzqt.AEQbTJ(OKComplianceRestrictionService.CefiMode.PRO);
                    boolean zAEQbTJ2 = this.OLrzqt.AEQbTJ(OKComplianceRestrictionService.CefiMode.LITE);
                    if (zAEQbTJ && zAEQbTJ2) {
                        return (this.AYXKKw.getFieldNames() ? DeeplinkMode.PRO : DeeplinkMode.LITE).getMode();
                    }
                    if (zAEQbTJ) {
                        return DeeplinkMode.PRO.getMode();
                    }
                    return DeeplinkMode.LITE.getMode();
                }
            }
            DeeplinkMode[] deeplinkModeArrValues = DeeplinkMode.values();
            int length = deeplinkModeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    deeplinkMode = null;
                    break;
                }
                deeplinkMode = deeplinkModeArrValues[i];
                if (Intrinsics.EZpvd((java.lang.Object) deeplinkMode.getMode(), (java.lang.Object) str)) {
                    break;
                }
                i++;
            }
            if (deeplinkMode != null) {
                return deeplinkMode.getMode();
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator implements InterfaceC2699AVv {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;

        public StateListAnimator(java.lang.String str, java.lang.String str2) {
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }

        @Override // o.InterfaceC2699AVv
        public java.lang.Object OLrzqt(Continuation<? super java.lang.Boolean> continuation) {
            return BuildersKt.withContext(Dispatchers.getMain(), new CoreLinkDependencyHelperImpl$switchModeIfRequired$1$execute$2(pMZ.this, this.KWHzl, this.AEQbTJ, null), continuation);
        }

        @Override // o.InterfaceC2699AVv
        public void EZpvd() {
            pUU.copydefault(pMZ.this.KWHzl, "switchModeIfRequired cancelled");
        }
    }

    @Override // o.AUI
    public InterfaceC2699AVv OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new StateListAnimator(str, str2);
    }

    @Override // o.AUI
    public boolean OLrzqt() {
        InterfaceC33174mrV interfaceC33174mrV;
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33174mrV.class));
        return (listKWHzl == null || (interfaceC33174mrV = (InterfaceC33174mrV) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || !interfaceC33174mrV.copydefault()) ? false : true;
    }

    public final DeeplinkMode KWHzl(java.lang.String str) {
        DeeplinkMode next;
        java.util.Iterator<DeeplinkMode> it = DeeplinkMode.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) next.getMode(), (java.lang.Object) str)) {
                break;
            }
        }
        return next;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application implements InterfaceC2699AVv {
        public final /* synthetic */ java.lang.String EZpvd;

        public Application(java.lang.String str) {
            this.EZpvd = str;
        }

        @Override // o.InterfaceC2699AVv
        public java.lang.Object OLrzqt(Continuation<? super java.lang.Boolean> continuation) {
            return BuildersKt.withContext(Dispatchers.getMain(), new CoreLinkDependencyHelperImpl$invokeLink$1$execute$2(pMZ.this, this.EZpvd, null), continuation);
        }

        @Override // o.InterfaceC2699AVv
        public void EZpvd() {
            pUU.copydefault(pMZ.this.KWHzl, "invokeLink cancelled");
        }
    }

    @Override // o.AUI
    public InterfaceC2699AVv copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Application(str);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar implements InterfaceC2699AVv {
        public ActionBar() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.InterfaceC2699AVv
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object OLrzqt(Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
            CoreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1 coreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1;
            if (continuation instanceof CoreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1) {
                coreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1 = (CoreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1) continuation;
                int i = coreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    coreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1.label = i - Integer.MIN_VALUE;
                } else {
                    coreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1 = new CoreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1(this, continuation);
                }
            }
            java.lang.Object obj = coreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = coreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowTake = FlowKt.take(pMZ.this.copydefault.AEQbTJ(), 1);
                coreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1.label = 1;
                if (FlowKt.collect(flowTake, coreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return C56443yFo.KWHzl(true);
        }

        @Override // o.InterfaceC2699AVv
        public void EZpvd() {
            pUU.copydefault(pMZ.this.KWHzl, "waitForConfigSync cancelled");
        }
    }

    @Override // o.AUI
    public InterfaceC2699AVv copydefault() {
        return new ActionBar();
    }

    @Override // o.AUI
    public void AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str) {
        pKI pki;
        pKI pki2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = map.get(RemoteMessageConst.Notification.CHANNEL_ID);
        if (str2 != null) {
            this.gEmmrt.AEQbTJ(str2);
        }
        java.lang.String str3 = map.get("ref");
        if (str3 != null && (pki2 = this.AhwBna) != null) {
            pki2.copydefault(str, str3);
        }
        java.lang.String str4 = map.get("utm_medium");
        pKM pkm = str4 != null ? new pKM(str4, map.get("utm_source"), map.get("utm_campaign"), map.get("utm_content"), map.get("utm_term")) : null;
        java.lang.String str5 = map.get("ref");
        if ((pkm == null && str5 == null) || (pki = this.AhwBna) == null) {
            return;
        }
        pki.EZpvd(str, pkm, str5);
    }

    @Override // o.AUI
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.util.Locale locale = new java.util.Locale(str);
            java.lang.String iSO3Language = locale.getISO3Language();
            Intrinsics.checkNotNullExpressionValue(iSO3Language, "");
            if (iSO3Language.length() <= 0) {
                return false;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) locale.getLanguage(), (java.lang.Object) str)) {
                if (!Intrinsics.EZpvd(locale.getLanguage(), StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(0))) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}

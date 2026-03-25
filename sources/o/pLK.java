package o;

import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType;
import com.okinc.lifecycle.impl.deeplink.core.LinkManagerImpl$handleLink$1;
import com.okinc.lifecycle.impl.deeplink.core.LinkManagerImpl$navigateToNative$1;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.modular.deeplinkv2.LinkSource;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.AbstractC43238rlX;
import o.pMC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pLK implements pLE {
    public final InterfaceC38081pLn AYXKKw;
    public final InterfaceC38091pLx AhwBna;
    public final Function2<java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.String> AkhnZx;
    public final InterfaceC38101pMg EZpvd;
    public final InterfaceC38098pMd KWHzl;
    public final InterfaceC38118pMx OLrzqt;
    public final CoroutineScope copydefault;
    public final InterfaceC38084pLq djBIcL;
    public Job gEmmrt;
    public final Function2<java.lang.String, java.lang.String, Unit> isConnected;
    public final C38064pKx valueOf;
    public final InterfaceC38100pMf values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public pLK(@NotNull InterfaceC38101pMg interfaceC38101pMg, @NotNull InterfaceC38098pMd interfaceC38098pMd, @NotNull InterfaceC38100pMf interfaceC38100pMf, @NotNull InterfaceC38084pLq interfaceC38084pLq, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38118pMx interfaceC38118pMx, @NotNull CoroutineScope coroutineScope, @NotNull InterfaceC38091pLx interfaceC38091pLx, @NotNull C38064pKx c38064pKx, @NotNull Function2<? super java.lang.String, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.String> function2, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function22) {
        Intrinsics.checkNotNullParameter(interfaceC38101pMg, "");
        Intrinsics.checkNotNullParameter(interfaceC38098pMd, "");
        Intrinsics.checkNotNullParameter(interfaceC38100pMf, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38118pMx, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(interfaceC38091pLx, "");
        Intrinsics.checkNotNullParameter(c38064pKx, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.EZpvd = interfaceC38101pMg;
        this.KWHzl = interfaceC38098pMd;
        this.values = interfaceC38100pMf;
        this.djBIcL = interfaceC38084pLq;
        this.AYXKKw = interfaceC38081pLn;
        this.OLrzqt = interfaceC38118pMx;
        this.copydefault = coroutineScope;
        this.AhwBna = interfaceC38091pLx;
        this.valueOf = c38064pKx;
        this.AkhnZx = function2;
        this.isConnected = function22;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pLK.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.pLE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43238rlX> continuation) throws java.lang.Throwable {
        LinkManagerImpl$navigateToNative$1 linkManagerImpl$navigateToNative$1;
        pLK plk;
        java.lang.String str2;
        java.lang.String str3;
        pLK plk2;
        if (continuation instanceof LinkManagerImpl$navigateToNative$1) {
            linkManagerImpl$navigateToNative$1 = (LinkManagerImpl$navigateToNative$1) continuation;
            int i = linkManagerImpl$navigateToNative$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                linkManagerImpl$navigateToNative$1.label = i - Integer.MIN_VALUE;
            } else {
                linkManagerImpl$navigateToNative$1 = new LinkManagerImpl$navigateToNative$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = linkManagerImpl$navigateToNative$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = linkManagerImpl$navigateToNative$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC38091pLx interfaceC38091pLx = this.AhwBna;
            linkManagerImpl$navigateToNative$1.L$0 = this;
            linkManagerImpl$navigateToNative$1.L$1 = str;
            linkManagerImpl$navigateToNative$1.label = 1;
            objAEQbTJ = interfaceC38091pLx.AEQbTJ(str, linkManagerImpl$navigateToNative$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            plk = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    return AbstractC43238rlX.StateListAnimator.OLrzqt;
                }
                str3 = (java.lang.String) linkManagerImpl$navigateToNative$1.L$2;
                str2 = (java.lang.String) linkManagerImpl$navigateToNative$1.L$1;
                plk2 = (pLK) linkManagerImpl$navigateToNative$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
                    plk2.AYXKKw.AEQbTJ(str3, LinkSource.H5_INTERCEPTION, AnalyticsLinkType.DEEPLINK);
                    InterfaceC38101pMg interfaceC38101pMg = plk2.EZpvd;
                    StateListAnimator stateListAnimator = plk2.new StateListAnimator(str2, str3);
                    linkManagerImpl$navigateToNative$1.L$0 = null;
                    linkManagerImpl$navigateToNative$1.L$1 = null;
                    linkManagerImpl$navigateToNative$1.L$2 = null;
                    linkManagerImpl$navigateToNative$1.label = 3;
                    if (interfaceC38101pMg.OLrzqt(str3, true, stateListAnimator, linkManagerImpl$navigateToNative$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return AbstractC43238rlX.StateListAnimator.OLrzqt;
                }
                return AbstractC43238rlX.Application.AEQbTJ;
            }
            str = (java.lang.String) linkManagerImpl$navigateToNative$1.L$1;
            plk = (pLK) linkManagerImpl$navigateToNative$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.lang.String str4 = (java.lang.String) objAEQbTJ;
        if (str4 != null && str4.length() != 0) {
            InterfaceC38101pMg interfaceC38101pMg2 = plk.EZpvd;
            linkManagerImpl$navigateToNative$1.L$0 = plk;
            linkManagerImpl$navigateToNative$1.L$1 = str;
            linkManagerImpl$navigateToNative$1.L$2 = str4;
            linkManagerImpl$navigateToNative$1.label = 2;
            java.lang.Object objKWHzl = interfaceC38101pMg2.KWHzl(str4, linkManagerImpl$navigateToNative$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            pLK plk3 = plk;
            str2 = str;
            str3 = str4;
            objAEQbTJ = objKWHzl;
            plk2 = plk3;
            if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
            }
        }
        return AbstractC43238rlX.Application.AEQbTJ;
    }

    public static final class StateListAnimator implements pLI {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.pLI
        public void AEQbTJ(LinkState linkState) {
            Intrinsics.checkNotNullParameter(linkState, "");
        }

        public StateListAnimator(java.lang.String str, java.lang.String str2) {
            this.KWHzl = str;
            this.EZpvd = str2;
        }

        @Override // o.pLI
        public void AEQbTJ() {
            pLK.this.valueOf.KWHzl(this.KWHzl, this.EZpvd);
        }
    }

    @Override // o.pLE
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull LinkSource linkSource, boolean z, @NotNull Function1<? super AbstractC43238rlX, Unit> function1) {
        AnalyticsLinkType analyticsLinkTypeOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(linkSource, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean z2 = true;
        if (linkSource == LinkSource.EXTERNAL && this.AYXKKw.AEQbTJ()) {
            Job job = this.gEmmrt;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.AYXKKw.OLrzqt(LinkState.NEW_LINK_TRIGGER_CANCELLED);
            this.djBIcL.EZpvd();
            this.AYXKKw.OLrzqt();
        }
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        if (linkSource != LinkSource.DOWNLOAD_HANDLER && linkSource != LinkSource.SHORTCODE_HANDLER) {
            z2 = false;
        }
        java.lang.String strKWHzl = KWHzl(string, map, z2);
        this.isConnected.invoke("LinkManagerImpl", strKWHzl);
        if (strKWHzl.length() == 0) {
            AEQbTJ(strKWHzl, linkSource, function1);
            return;
        }
        pMC pmcEZpvd = this.OLrzqt.EZpvd(strKWHzl);
        InterfaceC38081pLn interfaceC38081pLn = this.AYXKKw;
        if (pmcEZpvd instanceof pMC.TaskDescription) {
            analyticsLinkTypeOLrzqt = AnalyticsLinkType.DEEPLINK;
        } else if (pmcEZpvd instanceof pMC.StateListAnimator) {
            analyticsLinkTypeOLrzqt = AnalyticsLinkType.CUSTOM_SCHEME;
        } else {
            if (!(pmcEZpvd instanceof pMC.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsLinkTypeOLrzqt = this.KWHzl.OLrzqt(str);
        }
        interfaceC38081pLn.AEQbTJ(strKWHzl, linkSource, analyticsLinkTypeOLrzqt);
        if (this.AYXKKw.OLrzqt(linkSource)) {
            this.djBIcL.KWHzl();
        }
        this.gEmmrt = BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new LinkManagerImpl$handleLink$1(pmcEZpvd, this, strKWHzl, z, new Application(function1), null), 3, null);
    }

    public static final class Application implements pLI {
        public final /* synthetic */ Function1<AbstractC43238rlX, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.rlX, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super AbstractC43238rlX, Unit> function1) {
            this.copydefault = function1;
        }

        @Override // o.pLI
        public void AEQbTJ() {
            this.copydefault.invoke(AbstractC43238rlX.StateListAnimator.OLrzqt);
        }

        @Override // o.pLI
        public void AEQbTJ(LinkState linkState) {
            Intrinsics.checkNotNullParameter(linkState, "");
            this.copydefault.invoke(AbstractC43238rlX.Application.AEQbTJ);
        }
    }

    @Override // o.pLE
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pMC pmcEZpvd = this.OLrzqt.EZpvd(str);
        if (pmcEZpvd instanceof pMC.TaskDescription) {
            return this.EZpvd.KWHzl(str, continuation);
        }
        if (pmcEZpvd instanceof pMC.StateListAnimator) {
            return this.values.AEQbTJ(str, continuation);
        }
        if (pmcEZpvd instanceof pMC.Activity) {
            return this.KWHzl.copydefault(str, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // o.pLE
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.EZpvd(str);
    }

    public final void AEQbTJ(java.lang.String str, LinkSource linkSource, Function1<? super AbstractC43238rlX, Unit> function1) {
        this.AYXKKw.AEQbTJ(str, linkSource, AnalyticsLinkType.UNKNOWN);
        this.AYXKKw.OLrzqt(LinkState.EMPTY_LINK);
        this.djBIcL.EZpvd();
        function1.invoke(AbstractC43238rlX.Application.AEQbTJ);
    }

    @Override // o.pLE
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (z) {
            try {
                return this.AkhnZx.invoke(this.OLrzqt.KWHzl(str), map);
            } catch (java.lang.Exception unused) {
                return KWHzl(str, map);
            }
        }
        return KWHzl(str, map);
    }

    public final java.lang.String KWHzl(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.OLrzqt.KWHzl(str));
        if (StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().length() > 0 && (!map.isEmpty())) {
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "?", false, 2, (java.lang.Object) null)) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            } else {
                sb.append("?");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                arrayList.add(((java.lang.Object) key) + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue());
            }
            sb.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ContainerUtils.FIELD_DELIMITER, null, null, 0, null, null, 62, null));
        }
        return C33129mqd.gEmmrt(sb);
    }
}

package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.StsClient$Companion$finalizeConfig$1;
import aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import o.C57260yf;
import o.FilterInputStream;
import o.InterfaceC4078Ay;
import o.InterfaceC5134Ga;
import o.InterfaceC57207ye;
import o.InterfaceC57313yg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface WindowInsets extends InterfaceC57154yd {
    public static final StateListAnimator valueOf = StateListAnimator.copydefault;

    java.lang.Object AEQbTJ(@NotNull TextClassifier textClassifier, @NotNull Continuation<? super ExtractedText> continuation);

    ActionBar OLrzqt();

    java.lang.Object copydefault(@NotNull InputConnection inputConnection, @NotNull Continuation<? super ExtractedTextRequest> continuation);

    public static final class StateListAnimator extends IOError<ActionBar, ActionBar.Activity, WindowInsets, Activity> {
        public static final /* synthetic */ StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yd$StateListAnimator; */
        @Override // o.InterfaceC57101yc
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Activity EZpvd() {
            return new Activity();
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yd$StateListAnimator;Lo/HH;Lo/HH;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IOError
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull Activity activity, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            StsClient$Companion$finalizeConfig$1 stsClient$Companion$finalizeConfig$1;
            ActionBar.Activity activityEZpvd;
            DL dlAkhnZx;
            Activity activity2;
            ActionBar.Activity activity3;
            if (continuation instanceof StsClient$Companion$finalizeConfig$1) {
                stsClient$Companion$finalizeConfig$1 = (StsClient$Companion$finalizeConfig$1) continuation;
                int i = stsClient$Companion$finalizeConfig$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    stsClient$Companion$finalizeConfig$1.label = i - Integer.MIN_VALUE;
                } else {
                    stsClient$Companion$finalizeConfig$1 = new StsClient$Companion$finalizeConfig$1(this, continuation);
                }
            }
            StsClient$Companion$finalizeConfig$1 stsClient$Companion$finalizeConfig$12 = stsClient$Companion$finalizeConfig$1;
            java.lang.Object obj = stsClient$Companion$finalizeConfig$12.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = stsClient$Companion$finalizeConfig$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                activityEZpvd = activity.EZpvd();
                dlAkhnZx = activity.EZpvd().AkhnZx();
                if (dlAkhnZx == null) {
                    stsClient$Companion$finalizeConfig$12.L$0 = activity;
                    stsClient$Companion$finalizeConfig$12.L$1 = activityEZpvd;
                    stsClient$Companion$finalizeConfig$12.label = 1;
                    java.lang.Object objResolveEndpointUrl$default = FilterWriter.resolveEndpointUrl$default(hh, "Sts", "STS", "sts", null, stsClient$Companion$finalizeConfig$12, 16, null);
                    if (objResolveEndpointUrl$default == objCopydefault) {
                        return objCopydefault;
                    }
                    activity2 = activity;
                    activity3 = activityEZpvd;
                    obj = objResolveEndpointUrl$default;
                }
                activityEZpvd.AEQbTJ(dlAkhnZx);
                activity.EZpvd().isConnected().add(0, new C54238xB());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity3 = (ActionBar.Activity) stsClient$Companion$finalizeConfig$12.L$1;
            activity2 = (Activity) stsClient$Companion$finalizeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            dlAkhnZx = (DL) obj;
            activityEZpvd = activity3;
            activity = activity2;
            activityEZpvd.AEQbTJ(dlAkhnZx);
            activity.EZpvd().isConnected().add(0, new C54238xB());
            return Unit.INSTANCE;
        }
    }

    public static final class Activity extends AbstractC54698xS<ActionBar, ActionBar.Activity, WindowInsets> {
        public final ActionBar.Activity EZpvd = new ActionBar.Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yg$Activity; */
        @Override // o.InterfaceC57154yd.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public ActionBar.Activity EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yg;)Lo/yd; */
        @Override // o.AbstractC54698xS
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public WindowInsets copydefault(@NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return new WindowId(actionBar);
        }
    }

    public static final class ActionBar implements FilterInputStream, InterfaceC3444Am, InterfaceC57048yb, InterfaceC5134Ga {
        public static final C0807ActionBar EZpvd = new C0807ActionBar(null);
        public final /* synthetic */ InterfaceC3338Ak AEQbTJ;
        public final CorrectionInfo AYXKKw;
        public final java.lang.String AhwBna;
        public final InterfaceC5093El<java.lang.Object> AkhnZx;
        public final boolean AuCTel;
        public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> DbNXlk;
        public final java.lang.String KWHzl;
        public final AccessibilityRecord OLrzqt;
        public final /* synthetic */ InterfaceC57207ye copydefault;
        public final java.util.List<InterfaceC2861Ab> djBIcL;
        public final boolean fIwbmz;
        public final AbstractC54779xV fetchVPNInfo;
        public final InterfaceC52805wZ gEmmrt;
        public final FZ isConnected;
        public final DL valueOf;
        public final java.lang.String values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WindowInsets$ActionBar$Activity) A[MD:(o.WindowInsets$ActionBar$Activity):void (m)] call: o.WindowInsets.ActionBar.<init>(o.WindowInsets$ActionBar$Activity):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
            this(activity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CorrectionInfo AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AkhnZx() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean DbNXlk() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccessibilityRecord EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC2861Ab> copydefault() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC3338Ak
        public InterfaceC3972Aw djBIcL() {
            return this.AEQbTJ.djBIcL();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fJNWhG() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57207ye
        public DW fetchVPNInfo() {
            return this.copydefault.fetchVPNInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> gEmmrt() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC5093El<java.lang.Object> isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC54779xV valueOf() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FZ values() {
            return this.isConnected;
        }

        public ActionBar(Activity activity) {
            this.AEQbTJ = activity.KWHzl();
            this.copydefault = activity.copydefault();
            this.AhwBna = activity.AhwBna();
            this.values = activity.values();
            this.djBIcL = activity.valueOf();
            InterfaceC52805wZ interfaceC52805wZDjBIcL = activity.djBIcL();
            this.gEmmrt = interfaceC52805wZDjBIcL == null ? TruncateAt.KWHzl(new Drawable(null, null, djBIcL(), AkhnZx(), 3, null)) : interfaceC52805wZDjBIcL;
            CorrectionInfo correctionInfoGEmmrt = activity.gEmmrt();
            this.AYXKKw = correctionInfoGEmmrt == null ? new EditorInfo() : correctionInfoGEmmrt;
            this.valueOf = activity.AkhnZx();
            this.DbNXlk = activity.isConnected();
            AbstractC54779xV abstractC54779xVDbNXlk = activity.DbNXlk();
            this.fetchVPNInfo = abstractC54779xVDbNXlk == null ? AbstractC54779xV.Application.EZpvd : abstractC54779xVDbNXlk;
            InterfaceC5093El<java.lang.Object> interfaceC5093ElFetchVPNInfo = activity.fetchVPNInfo();
            this.AkhnZx = interfaceC5093ElFetchVPNInfo == null ? AbstractMethodError.AEQbTJ.OLrzqt() : interfaceC5093ElFetchVPNInfo;
            FZ fzAuCTel = activity.AuCTel();
            this.isConnected = fzAuCTel == null ? FU.OLrzqt(FZ.AYXKKw) : fzAuCTel;
            java.lang.Boolean boolFIwbmz = activity.fIwbmz();
            this.AuCTel = boolFIwbmz != null ? boolFIwbmz.booleanValue() : false;
            java.lang.Boolean boolFJNWhG = activity.fJNWhG();
            this.fIwbmz = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
            this.KWHzl = activity.EZpvd();
            AccessibilityRecord accessibilityRecordAYXKKw = activity.AYXKKw();
            this.OLrzqt = accessibilityRecordAYXKKw == null ? new Animation(null, 1, 0 == true ? 1 : 0) : accessibilityRecordAYXKKw;
        }

        /* JADX INFO: renamed from: o.WindowInsets$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0807ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WindowInsets.ActionBar.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0807ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0807ActionBar() {
            }
        }

        public static final class Activity implements FilterInputStream.Application, InterfaceC3285Aj, InterfaceC57207ye.StateListAnimator, InterfaceC57313yg.Activity<ActionBar>, InterfaceC5134Ga.Activity {
            public AccessibilityRecord AEQbTJ;
            public InterfaceC52805wZ AYXKKw;
            public FZ AkhnZx;
            public java.lang.Boolean DbNXlk;
            public java.lang.String EZpvd;
            public java.lang.Boolean fIwbmz;
            public InterfaceC5093El<java.lang.Object> fetchVPNInfo;
            public CorrectionInfo gEmmrt;
            public java.lang.String isConnected;
            public DL valueOf;
            public AbstractC54779xV values;
            public final /* synthetic */ HttpEngineConfigImpl.Activity KWHzl = new HttpEngineConfigImpl.Activity();
            public final /* synthetic */ C57260yf.TaskDescription OLrzqt = new C57260yf.TaskDescription();
            public java.lang.String AhwBna = "STS";
            public java.util.List<? extends InterfaceC2861Ab> copydefault = yDY.AhwBna();
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> djBIcL = new java.util.ArrayList();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void AEQbTJ(DL dl) {
                this.valueOf = dl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void AEQbTJ(InterfaceC52805wZ interfaceC52805wZ) {
                this.AYXKKw = interfaceC52805wZ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AccessibilityRecord AYXKKw() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AhwBna() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DL AkhnZx() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5134Ga.Activity
            public FZ AuCTel() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public AbstractC54779xV DbNXlk() {
                return this.values;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public void EZpvd(@NotNull Function1<? super InterfaceC4078Ay.ActionBar, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                this.KWHzl.EZpvd(function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC3338Ak KWHzl() {
                return this.KWHzl.EZpvd();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void KWHzl(java.lang.Boolean bool) {
                this.DbNXlk = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void KWHzl(@NotNull InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, @NotNull Function1<? super B, Unit> function1) {
                Intrinsics.checkNotNullParameter(interfaceC3232Ai, "");
                Intrinsics.checkNotNullParameter(function1, "");
                this.KWHzl.KWHzl(interfaceC3232Ai, function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57207ye.StateListAnimator
            public void KWHzl(DW dw) {
                this.OLrzqt.KWHzl(dw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public void KWHzl(AbstractC54779xV abstractC54779xV) {
                this.values = abstractC54779xV;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void OLrzqt(java.lang.String str) {
                this.isConnected = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void OLrzqt(FZ fz) {
                this.AkhnZx = fz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC57207ye copydefault() {
                return this.OLrzqt.copydefault();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.Boolean bool) {
                this.fIwbmz = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.String str) {
                this.EZpvd = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void copydefault(InterfaceC3972Aw interfaceC3972Aw) {
                this.KWHzl.copydefault(interfaceC3972Aw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC52805wZ djBIcL() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fIwbmz() {
                return this.DbNXlk;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fJNWhG() {
                return this.fIwbmz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC5093El<java.lang.Object> fetchVPNInfo() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CorrectionInfo gEmmrt() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> isConnected() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.Ab>, java.util.List<o.Ab> */
            public java.util.List<InterfaceC2861Ab> valueOf() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String values() {
                return this.isConnected;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.InterfaceC5183Hx
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public ActionBar OLrzqt() {
                return new ActionBar(this, null);
            }
        }
    }
}

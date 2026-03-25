package o;

import aws.sdk.kotlin.services.polly.PollyClient$Companion$finalizeConfig$1;
import aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import o.AnimationUtils;
import o.BounceInterpolator;
import o.C57260yf;
import o.FilterInputStream;
import o.InterfaceC4078Ay;
import o.InterfaceC5134Ga;
import o.InterfaceC57207ye;
import o.InterfaceC57313yg;
import o.WindowManagerImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ViewHierarchyEncoder extends InterfaceC57154yd {
    public static final TaskDescription gEmmrt = TaskDescription.OLrzqt;

    java.lang.Object deleteLexicon(@NotNull WindowManagerGlobal windowManagerGlobal, @NotNull Continuation<? super WindowInfo> continuation);

    java.lang.Object describeVoices(@NotNull WindowManagerImpl windowManagerImpl, @NotNull Continuation<? super AccessibilityManager> continuation);

    StateListAnimator getConfig();

    java.lang.Object getLexicon(@NotNull AccessibilityInteractionClient accessibilityInteractionClient, @NotNull Continuation<? super AccessibilityRequestPreparer> continuation);

    java.lang.Object getSpeechSynthesisTask(@NotNull AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, @NotNull Continuation<? super CaptioningManager> continuation);

    java.lang.Object listLexicons(@NotNull AnimationUtils animationUtils, @NotNull Continuation<? super AnticipateInterpolator> continuation);

    java.lang.Object listSpeechSynthesisTasks(@NotNull BounceInterpolator bounceInterpolator, @NotNull Continuation<? super AnticipateOvershootInterpolator> continuation);

    java.lang.Object putLexicon(@NotNull GridLayoutAnimationController gridLayoutAnimationController, @NotNull Continuation<? super Interpolator> continuation);

    java.lang.Object startSpeechSynthesisTask(@NotNull ClipRectAnimation clipRectAnimation, @NotNull Continuation<? super OvershootInterpolator> continuation);

    <T> java.lang.Object synthesizeSpeech(@NotNull PathInterpolator pathInterpolator, @NotNull Function2<? super LinearInterpolator, ? super Continuation<? super T>, ? extends java.lang.Object> function2, @NotNull Continuation<? super T> continuation);

    public static final class TaskDescription extends IOError<StateListAnimator, StateListAnimator.Activity, ViewHierarchyEncoder, ActionBar> {
        public static final /* synthetic */ TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yd$StateListAnimator; */
        @Override // o.InterfaceC57101yc
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public ActionBar EZpvd() {
            return new ActionBar();
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yd$StateListAnimator;Lo/HH;Lo/HH;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IOError
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull ActionBar actionBar, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            PollyClient$Companion$finalizeConfig$1 pollyClient$Companion$finalizeConfig$1;
            StateListAnimator.Activity activityEZpvd;
            DL dlIsConnected;
            ActionBar actionBar2;
            StateListAnimator.Activity activity;
            if (continuation instanceof PollyClient$Companion$finalizeConfig$1) {
                pollyClient$Companion$finalizeConfig$1 = (PollyClient$Companion$finalizeConfig$1) continuation;
                int i = pollyClient$Companion$finalizeConfig$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pollyClient$Companion$finalizeConfig$1.label = i - Integer.MIN_VALUE;
                } else {
                    pollyClient$Companion$finalizeConfig$1 = new PollyClient$Companion$finalizeConfig$1(this, continuation);
                }
            }
            PollyClient$Companion$finalizeConfig$1 pollyClient$Companion$finalizeConfig$12 = pollyClient$Companion$finalizeConfig$1;
            java.lang.Object obj = pollyClient$Companion$finalizeConfig$12.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = pollyClient$Companion$finalizeConfig$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                activityEZpvd = actionBar.EZpvd();
                dlIsConnected = actionBar.EZpvd().isConnected();
                if (dlIsConnected == null) {
                    pollyClient$Companion$finalizeConfig$12.L$0 = actionBar;
                    pollyClient$Companion$finalizeConfig$12.L$1 = activityEZpvd;
                    pollyClient$Companion$finalizeConfig$12.label = 1;
                    java.lang.Object objResolveEndpointUrl$default = FilterWriter.resolveEndpointUrl$default(hh, "Polly", "POLLY", "polly", null, pollyClient$Companion$finalizeConfig$12, 16, null);
                    if (objResolveEndpointUrl$default == objCopydefault) {
                        return objCopydefault;
                    }
                    actionBar2 = actionBar;
                    activity = activityEZpvd;
                    obj = objResolveEndpointUrl$default;
                }
                activityEZpvd.copydefault(dlIsConnected);
                actionBar.EZpvd().fetchVPNInfo().add(0, new C54238xB());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (StateListAnimator.Activity) pollyClient$Companion$finalizeConfig$12.L$1;
            actionBar2 = (ActionBar) pollyClient$Companion$finalizeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            dlIsConnected = (DL) obj;
            activityEZpvd = activity;
            actionBar = actionBar2;
            activityEZpvd.copydefault(dlIsConnected);
            actionBar.EZpvd().fetchVPNInfo().add(0, new C54238xB());
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar extends AbstractC54698xS<StateListAnimator, StateListAnimator.Activity, ViewHierarchyEncoder> {
        public final StateListAnimator.Activity OLrzqt = new StateListAnimator.Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yg$Activity; */
        @Override // o.InterfaceC57154yd.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public StateListAnimator.Activity EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yg;)Lo/yd; */
        @Override // o.AbstractC54698xS
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public ViewHierarchyEncoder copydefault(@NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return new ThreadedRenderer(stateListAnimator);
        }
    }

    public static final class StateListAnimator implements FilterInputStream, InterfaceC3444Am, InterfaceC57048yb, InterfaceC5134Ga {
        public static final ActionBar AEQbTJ = new ActionBar(null);
        public final WindowCallbacks AYXKKw;
        public final java.util.List<InterfaceC2861Ab> AhwBna;
        public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AkhnZx;
        public final boolean AuCTel;
        public final AbstractC54779xV DbNXlk;
        public final java.lang.String EZpvd;
        public final /* synthetic */ InterfaceC57207ye KWHzl;
        public final /* synthetic */ InterfaceC3338Ak OLrzqt;
        public final ViewGroupOverlay copydefault;
        public final java.lang.String djBIcL;
        public final boolean fIwbmz;
        public final FZ fetchVPNInfo;
        public final InterfaceC52805wZ gEmmrt;
        public final java.lang.String isConnected;
        public final DL valueOf;
        public final InterfaceC5093El<java.lang.Object> values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ViewHierarchyEncoder$StateListAnimator$Activity) A[MD:(o.ViewHierarchyEncoder$StateListAnimator$Activity):void (m)] call: o.ViewHierarchyEncoder.StateListAnimator.<init>(o.ViewHierarchyEncoder$StateListAnimator$Activity):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
            this(activity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC2861Ab> AEQbTJ() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AhwBna() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FZ DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ViewGroupOverlay KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC3338Ak
        public InterfaceC3972Aw djBIcL() {
            return this.OLrzqt.djBIcL();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean ejfBZ() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57207ye
        public DW fetchVPNInfo() {
            return this.KWHzl.fetchVPNInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WindowCallbacks gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean isConnected() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC54779xV valueOf() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC5093El<java.lang.Object> values() {
            return this.values;
        }

        public StateListAnimator(Activity activity) {
            this.OLrzqt = activity.copydefault();
            this.KWHzl = activity.AEQbTJ();
            this.djBIcL = activity.AYXKKw();
            this.isConnected = activity.values();
            this.AhwBna = activity.AhwBna();
            InterfaceC52805wZ interfaceC52805wZValueOf = activity.valueOf();
            this.gEmmrt = interfaceC52805wZValueOf == null ? TruncateAt.KWHzl(new Drawable(null, null, djBIcL(), AkhnZx(), 3, null)) : interfaceC52805wZValueOf;
            WindowCallbacks windowCallbacksDjBIcL = activity.djBIcL();
            this.AYXKKw = windowCallbacksDjBIcL == null ? new ViewRootImpl() : windowCallbacksDjBIcL;
            this.valueOf = activity.isConnected();
            this.AkhnZx = activity.fetchVPNInfo();
            AbstractC54779xV abstractC54779xVDbNXlk = activity.DbNXlk();
            this.DbNXlk = abstractC54779xVDbNXlk == null ? AbstractC54779xV.Application.EZpvd : abstractC54779xVDbNXlk;
            InterfaceC5093El<java.lang.Object> interfaceC5093ElAkhnZx = activity.AkhnZx();
            this.values = interfaceC5093ElAkhnZx == null ? AbstractMethodError.AEQbTJ.OLrzqt() : interfaceC5093ElAkhnZx;
            FZ fzAuCTel = activity.AuCTel();
            this.fetchVPNInfo = fzAuCTel == null ? FU.OLrzqt(FZ.AYXKKw) : fzAuCTel;
            java.lang.Boolean boolFIwbmz = activity.fIwbmz();
            this.fIwbmz = boolFIwbmz != null ? boolFIwbmz.booleanValue() : false;
            java.lang.Boolean boolFJNWhG = activity.fJNWhG();
            this.AuCTel = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
            this.EZpvd = activity.EZpvd();
            ViewGroupOverlay viewGroupOverlayGEmmrt = activity.gEmmrt();
            this.copydefault = viewGroupOverlayGEmmrt == null ? new ViewConfiguration(null, 1, 0 == true ? 1 : 0) : viewGroupOverlayGEmmrt;
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ViewHierarchyEncoder.StateListAnimator.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }

        public static final class Activity implements FilterInputStream.Application, InterfaceC3285Aj, InterfaceC57207ye.StateListAnimator, InterfaceC57313yg.Activity<StateListAnimator>, InterfaceC5134Ga.Activity {
            public DL AhwBna;
            public FZ AkhnZx;
            public AbstractC54779xV DbNXlk;
            public ViewGroupOverlay OLrzqt;
            public java.lang.String copydefault;
            public WindowCallbacks djBIcL;
            public java.lang.Boolean fARcdN;
            public java.lang.Boolean fetchVPNInfo;
            public InterfaceC52805wZ gEmmrt;
            public InterfaceC5093El<java.lang.Object> isConnected;
            public java.lang.String values;
            public final /* synthetic */ HttpEngineConfigImpl.Activity KWHzl = new HttpEngineConfigImpl.Activity();
            public final /* synthetic */ C57260yf.TaskDescription AEQbTJ = new C57260yf.TaskDescription();
            public java.lang.String valueOf = "Polly";
            public java.util.List<? extends InterfaceC2861Ab> EZpvd = yDY.AhwBna();
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AYXKKw = new java.util.ArrayList();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC57207ye AEQbTJ() {
                return this.AEQbTJ.copydefault();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void AEQbTJ(InterfaceC52805wZ interfaceC52805wZ) {
                this.gEmmrt = interfaceC52805wZ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AYXKKw() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.Ab>, java.util.List<o.Ab> */
            public java.util.List<InterfaceC2861Ab> AhwBna() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC5093El<java.lang.Object> AkhnZx() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5134Ga.Activity
            public FZ AuCTel() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public AbstractC54779xV DbNXlk() {
                return this.DbNXlk;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public void EZpvd(@NotNull Function1<? super InterfaceC4078Ay.ActionBar, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                this.KWHzl.EZpvd(function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void KWHzl(java.lang.Boolean bool) {
                this.fetchVPNInfo = bool;
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
                this.AEQbTJ.KWHzl(dw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public void KWHzl(AbstractC54779xV abstractC54779xV) {
                this.DbNXlk = abstractC54779xV;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void OLrzqt(java.lang.String str) {
                this.values = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC3338Ak copydefault() {
                return this.KWHzl.EZpvd();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.Boolean bool) {
                this.fARcdN = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.String str) {
                this.copydefault = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void copydefault(DL dl) {
                this.AhwBna = dl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WindowCallbacks djBIcL() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fIwbmz() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fJNWhG() {
                return this.fARcdN;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> fetchVPNInfo() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ViewGroupOverlay gEmmrt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DL isConnected() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC52805wZ valueOf() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String values() {
                return this.values;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.InterfaceC5183Hx
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public StateListAnimator OLrzqt() {
                return new StateListAnimator(this, null);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        public static /* synthetic */ java.lang.Object describeVoices$default(ViewHierarchyEncoder viewHierarchyEncoder, WindowManagerImpl windowManagerImpl, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: describeVoices");
            }
            if ((i & 1) != 0) {
                windowManagerImpl = WindowManagerImpl.OLrzqt.EZpvd(new Function1<WindowManagerImpl.Activity, Unit>() { // from class: aws.sdk.kotlin.services.polly.PollyClient$describeVoices$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull WindowManagerImpl.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowManagerImpl.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }
                });
            }
            return viewHierarchyEncoder.describeVoices(windowManagerImpl, continuation);
        }

        public static /* synthetic */ java.lang.Object listLexicons$default(ViewHierarchyEncoder viewHierarchyEncoder, AnimationUtils animationUtils, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listLexicons");
            }
            if ((i & 1) != 0) {
                animationUtils = AnimationUtils.KWHzl.copydefault(new Function1<AnimationUtils.TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.polly.PollyClient$listLexicons$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AnimationUtils.TaskDescription taskDescription) {
                        Intrinsics.checkNotNullParameter(taskDescription, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationUtils.TaskDescription taskDescription) {
                        invoke2(taskDescription);
                        return Unit.INSTANCE;
                    }
                });
            }
            return viewHierarchyEncoder.listLexicons(animationUtils, continuation);
        }

        public static /* synthetic */ java.lang.Object listSpeechSynthesisTasks$default(ViewHierarchyEncoder viewHierarchyEncoder, BounceInterpolator bounceInterpolator, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listSpeechSynthesisTasks");
            }
            if ((i & 1) != 0) {
                bounceInterpolator = BounceInterpolator.copydefault.copydefault(new Function1<BounceInterpolator.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.polly.PollyClient$listSpeechSynthesisTasks$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull BounceInterpolator.StateListAnimator stateListAnimator) {
                        Intrinsics.checkNotNullParameter(stateListAnimator, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BounceInterpolator.StateListAnimator stateListAnimator) {
                        invoke2(stateListAnimator);
                        return Unit.INSTANCE;
                    }
                });
            }
            return viewHierarchyEncoder.listSpeechSynthesisTasks(bounceInterpolator, continuation);
        }
    }
}

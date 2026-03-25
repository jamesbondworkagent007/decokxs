package o;

import aws.sdk.kotlin.services.rekognition.RekognitionClient$Companion$finalizeConfig$1;
import aws.smithy.kotlin.runtime.http.engine.HttpEngineConfigImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import o.C57260yf;
import o.Checkable;
import o.D;
import o.FilterInputStream;
import o.InterfaceC4078Ay;
import o.InterfaceC5134Ga;
import o.InterfaceC57154yd;
import o.InterfaceC57207ye;
import o.InterfaceC57313yg;
import o.LinearLayout;
import o.O;
import o.P;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface UrlInterceptRegistry extends InterfaceC57154yd {
    public static final Activity gEmmrt = Activity.AEQbTJ;

    java.lang.Object AEQbTJ(@NotNull ZoomButton zoomButton, @NotNull Continuation<? super C8296b> continuation);

    java.lang.Object AEQbTJ(@NotNull C6317aN c6317aN, @NotNull Continuation<? super C6264aM> continuation);

    java.lang.Object EZpvd(@NotNull D d, @NotNull Continuation<? super B> continuation);

    java.lang.Object EZpvd(@NotNull LinearLayout linearLayout, @NotNull Continuation<? super Magnifier> continuation);

    java.lang.Object EZpvd(@NotNull ListPopupWindow listPopupWindow, @NotNull Continuation<? super ListAdapter> continuation);

    java.lang.Object EZpvd(@NotNull RatingBar ratingBar, @NotNull Continuation<? super RadioGroup> continuation);

    java.lang.Object EZpvd(@NotNull ViewAnimator viewAnimator, @NotNull Continuation<? super ViewSwitcher> continuation);

    java.lang.Object EZpvd(@NotNull C5627a c5627a, @NotNull Continuation<? super C17293f> continuation);

    java.lang.Object EZpvd(@NotNull C6423aP c6423aP, @NotNull Continuation<? super C6476aQ> continuation);

    java.lang.Object EZpvd(@NotNull C15212e c15212e, @NotNull Continuation<? super C11053c> continuation);

    java.lang.Object KWHzl(@NotNull F f, @NotNull Continuation<? super H> continuation);

    java.lang.Object KWHzl(@NotNull MediaControlView2 mediaControlView2, @NotNull Continuation<? super MenuItemHoverListener> continuation);

    java.lang.Object KWHzl(@NotNull O o2, @NotNull Continuation<? super L> continuation);

    java.lang.Object KWHzl(@NotNull P p, @NotNull Continuation<? super U> continuation);

    java.lang.Object KWHzl(@NotNull QuickContactBadge quickContactBadge, @NotNull Continuation<? super RelativeLayout> continuation);

    java.lang.Object KWHzl(@NotNull TextSwitcher textSwitcher, @NotNull Continuation<? super TextViewMetrics> continuation);

    java.lang.Object KWHzl(@NotNull YearPickerView yearPickerView, @NotNull Continuation<? super WrapperListAdapter> continuation);

    java.lang.Object OLrzqt(@NotNull Checkable checkable, @NotNull Continuation<? super CalendarViewMaterialDelegate> continuation);

    java.lang.Object OLrzqt(@NotNull G g, @NotNull Continuation<? super K> continuation);

    java.lang.Object OLrzqt(@NotNull M m, @NotNull Continuation<? super N> continuation);

    java.lang.Object OLrzqt(@NotNull ThemedSpinnerAdapter themedSpinnerAdapter, @NotNull Continuation<? super VideoView2> continuation);

    java.lang.Object copydefault(@NotNull J j, @NotNull Continuation<? super I> continuation);

    java.lang.Object copydefault(@NotNull RemoteViewsAdapter remoteViewsAdapter, @NotNull Continuation<? super ResourceCursorAdapter> continuation);

    java.lang.Object copydefault(@NotNull T t, @NotNull Continuation<? super Q> continuation);

    java.lang.Object copydefault(@NotNull ToggleButton toggleButton, @NotNull Continuation<? super VideoView> continuation);

    public static final class Activity extends IOError<TaskDescription, TaskDescription.C0806TaskDescription, UrlInterceptRegistry, StateListAnimator> {
        public static final /* synthetic */ Activity AEQbTJ = new Activity();

        private Activity() {
        }

        @Override // o.IOError
        public /* bridge */ /* synthetic */ java.lang.Object AEQbTJ(InterfaceC57154yd.StateListAnimator stateListAnimator, HH hh, HH hh2, Continuation continuation) {
            return AEQbTJ((StateListAnimator) stateListAnimator, (HH<ObjectOutputStream>) hh, (HH<ObjectStreamField>) hh2, (Continuation<? super Unit>) continuation);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yd$StateListAnimator; */
        @Override // o.InterfaceC57101yc
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public StateListAnimator EZpvd() {
            return new StateListAnimator();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object AEQbTJ(@NotNull StateListAnimator stateListAnimator, @NotNull HH<ObjectOutputStream> hh, @NotNull HH<ObjectStreamField> hh2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            RekognitionClient$Companion$finalizeConfig$1 rekognitionClient$Companion$finalizeConfig$1;
            TaskDescription.C0806TaskDescription c0806TaskDescriptionEZpvd;
            DL dlFetchVPNInfo;
            StateListAnimator stateListAnimator2;
            TaskDescription.C0806TaskDescription c0806TaskDescription;
            if (continuation instanceof RekognitionClient$Companion$finalizeConfig$1) {
                rekognitionClient$Companion$finalizeConfig$1 = (RekognitionClient$Companion$finalizeConfig$1) continuation;
                int i = rekognitionClient$Companion$finalizeConfig$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    rekognitionClient$Companion$finalizeConfig$1.label = i - Integer.MIN_VALUE;
                } else {
                    rekognitionClient$Companion$finalizeConfig$1 = new RekognitionClient$Companion$finalizeConfig$1(this, continuation);
                }
            }
            RekognitionClient$Companion$finalizeConfig$1 rekognitionClient$Companion$finalizeConfig$12 = rekognitionClient$Companion$finalizeConfig$1;
            java.lang.Object obj = rekognitionClient$Companion$finalizeConfig$12.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = rekognitionClient$Companion$finalizeConfig$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                c0806TaskDescriptionEZpvd = stateListAnimator.EZpvd();
                dlFetchVPNInfo = stateListAnimator.EZpvd().fetchVPNInfo();
                if (dlFetchVPNInfo == null) {
                    rekognitionClient$Companion$finalizeConfig$12.L$0 = stateListAnimator;
                    rekognitionClient$Companion$finalizeConfig$12.L$1 = c0806TaskDescriptionEZpvd;
                    rekognitionClient$Companion$finalizeConfig$12.label = 1;
                    java.lang.Object objResolveEndpointUrl$default = FilterWriter.resolveEndpointUrl$default(hh, "Rekognition", "REKOGNITION", "rekognition", null, rekognitionClient$Companion$finalizeConfig$12, 16, null);
                    if (objResolveEndpointUrl$default == objCopydefault) {
                        return objCopydefault;
                    }
                    stateListAnimator2 = stateListAnimator;
                    c0806TaskDescription = c0806TaskDescriptionEZpvd;
                    obj = objResolveEndpointUrl$default;
                }
                c0806TaskDescriptionEZpvd.OLrzqt(dlFetchVPNInfo);
                stateListAnimator.EZpvd().AkhnZx().add(0, new C54238xB());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0806TaskDescription = (TaskDescription.C0806TaskDescription) rekognitionClient$Companion$finalizeConfig$12.L$1;
            stateListAnimator2 = (StateListAnimator) rekognitionClient$Companion$finalizeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            dlFetchVPNInfo = (DL) obj;
            c0806TaskDescriptionEZpvd = c0806TaskDescription;
            stateListAnimator = stateListAnimator2;
            c0806TaskDescriptionEZpvd.OLrzqt(dlFetchVPNInfo);
            stateListAnimator.EZpvd().AkhnZx().add(0, new C54238xB());
            return Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator extends AbstractC54698xS<TaskDescription, TaskDescription.C0806TaskDescription, UrlInterceptRegistry> {
        public final TaskDescription.C0806TaskDescription copydefault = new TaskDescription.C0806TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yg$Activity; */
        @Override // o.InterfaceC57154yd.StateListAnimator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public TaskDescription.C0806TaskDescription EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yg;)Lo/yd; */
        @Override // o.AbstractC54698xS
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public UrlInterceptRegistry copydefault(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            return new ValueCallback(taskDescription);
        }
    }

    public static final class TaskDescription implements FilterInputStream, InterfaceC3444Am, InterfaceC57048yb, InterfaceC5134Ga {
        public static final Application EZpvd = new Application(null);
        public final /* synthetic */ InterfaceC3338Ak AEQbTJ;
        public final DL AYXKKw;
        public final java.util.List<InterfaceC2861Ab> AhwBna;
        public final AbstractC54779xV AkhnZx;
        public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> DbNXlk;
        public final java.lang.String KWHzl;
        public final /* synthetic */ InterfaceC57207ye OLrzqt;
        public final WebMessagePort copydefault;
        public final java.lang.String djBIcL;
        public final boolean ejfBZ;
        public final boolean fARcdN;
        public final FZ fJNWhG;
        public final java.lang.String fetchVPNInfo;
        public final InterfaceC52805wZ gEmmrt;
        public final InterfaceC5093El<java.lang.Object> isConnected;
        public final WebResourceResponse valueOf;
        public final InterfaceC54806xW values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.UrlInterceptRegistry$TaskDescription$TaskDescription) A[MD:(o.UrlInterceptRegistry$TaskDescription$TaskDescription):void (m)] call: o.UrlInterceptRegistry.TaskDescription.<init>(o.UrlInterceptRegistry$TaskDescription$TaskDescription):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(C0806TaskDescription c0806TaskDescription, DefaultConstructorMarker defaultConstructorMarker) {
            this(c0806TaskDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC2861Ab> AEQbTJ() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AhwBna() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FZ AkhnZx() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC5093El<java.lang.Object> DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebMessagePort EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ OLrzqt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC3338Ak
        public InterfaceC3972Aw djBIcL() {
            return this.AEQbTJ.djBIcL();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean ejfBZ() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean fJNWhG() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57207ye
        public DW fetchVPNInfo() {
            return this.OLrzqt.fetchVPNInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC54806xW gEmmrt() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebResourceResponse valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC54779xV values() {
            return this.AkhnZx;
        }

        public TaskDescription(C0806TaskDescription c0806TaskDescription) {
            this.AEQbTJ = c0806TaskDescription.AEQbTJ();
            this.OLrzqt = c0806TaskDescription.copydefault();
            this.djBIcL = c0806TaskDescription.AYXKKw();
            this.fetchVPNInfo = c0806TaskDescription.values();
            this.AhwBna = c0806TaskDescription.gEmmrt();
            InterfaceC52805wZ interfaceC52805wZAhwBna = c0806TaskDescription.AhwBna();
            this.gEmmrt = interfaceC52805wZAhwBna == null ? TruncateAt.KWHzl(new Drawable(null, null, djBIcL(), isConnected(), 3, null)) : interfaceC52805wZAhwBna;
            WebResourceResponse webResourceResponseDjBIcL = c0806TaskDescription.djBIcL();
            this.valueOf = webResourceResponseDjBIcL == null ? new WebHistoryItem() : webResourceResponseDjBIcL;
            this.AYXKKw = c0806TaskDescription.fetchVPNInfo();
            InterfaceC54806xW interfaceC54806xWIsConnected = c0806TaskDescription.isConnected();
            this.values = interfaceC54806xWIsConnected == null ? InterfaceC54806xW.EZpvd.EZpvd() : interfaceC54806xWIsConnected;
            this.DbNXlk = c0806TaskDescription.AkhnZx();
            AbstractC54779xV abstractC54779xVDbNXlk = c0806TaskDescription.DbNXlk();
            this.AkhnZx = abstractC54779xVDbNXlk == null ? AbstractC54779xV.Application.EZpvd : abstractC54779xVDbNXlk;
            InterfaceC5093El<java.lang.Object> interfaceC5093ElEjfBZ = c0806TaskDescription.ejfBZ();
            this.isConnected = interfaceC5093ElEjfBZ == null ? AbstractMethodError.AEQbTJ.OLrzqt() : interfaceC5093ElEjfBZ;
            FZ fzAuCTel = c0806TaskDescription.AuCTel();
            this.fJNWhG = fzAuCTel == null ? FU.OLrzqt(FZ.AYXKKw) : fzAuCTel;
            java.lang.Boolean boolFIwbmz = c0806TaskDescription.fIwbmz();
            this.ejfBZ = boolFIwbmz != null ? boolFIwbmz.booleanValue() : false;
            java.lang.Boolean boolFJNWhG = c0806TaskDescription.fJNWhG();
            this.fARcdN = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
            this.KWHzl = c0806TaskDescription.EZpvd();
            WebMessagePort webMessagePortValueOf = c0806TaskDescription.valueOf();
            this.copydefault = webMessagePortValueOf == null ? new WebBackForwardList(null, 1, 0 == true ? 1 : 0) : webMessagePortValueOf;
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UrlInterceptRegistry.TaskDescription.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }

        /* JADX INFO: renamed from: o.UrlInterceptRegistry$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0806TaskDescription implements FilterInputStream.Application, InterfaceC3285Aj, InterfaceC57207ye.StateListAnimator, InterfaceC57313yg.Activity<TaskDescription>, InterfaceC5134Ga.Activity {
            public WebMessagePort AEQbTJ;
            public InterfaceC54806xW AYXKKw;
            public InterfaceC52805wZ AhwBna;
            public AbstractC54779xV AkhnZx;
            public java.lang.Boolean AuCTel;
            public InterfaceC5093El<java.lang.Object> DbNXlk;
            public java.lang.String KWHzl;
            public java.lang.Boolean fIwbmz;
            public FZ fetchVPNInfo;
            public WebResourceResponse gEmmrt;
            public DL valueOf;
            public java.lang.String values;
            public final /* synthetic */ HttpEngineConfigImpl.Activity copydefault = new HttpEngineConfigImpl.Activity();
            public final /* synthetic */ C57260yf.TaskDescription EZpvd = new C57260yf.TaskDescription();
            public java.lang.String djBIcL = "Rekognition";
            public java.util.List<? extends InterfaceC2861Ab> OLrzqt = yDY.AhwBna();
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> isConnected = new java.util.ArrayList();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC3338Ak AEQbTJ() {
                return this.copydefault.EZpvd();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AYXKKw() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC52805wZ AhwBna() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> AkhnZx() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5134Ga.Activity
            public FZ AuCTel() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public AbstractC54779xV DbNXlk() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public void EZpvd(@NotNull Function1<? super InterfaceC4078Ay.ActionBar, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                this.copydefault.EZpvd(function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public void EZpvd(InterfaceC52805wZ interfaceC52805wZ) {
                this.AhwBna = interfaceC52805wZ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void KWHzl(java.lang.Boolean bool) {
                this.fIwbmz = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC3338Ak.StateListAnimator
            public <B extends InterfaceC4078Ay.ActionBar, E extends InterfaceC3972Aw> void KWHzl(@NotNull InterfaceC3232Ai<? extends B, E> interfaceC3232Ai, @NotNull Function1<? super B, Unit> function1) {
                Intrinsics.checkNotNullParameter(interfaceC3232Ai, "");
                Intrinsics.checkNotNullParameter(function1, "");
                this.copydefault.KWHzl(interfaceC3232Ai, function1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57207ye.StateListAnimator
            public void KWHzl(DW dw) {
                this.EZpvd.KWHzl(dw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57313yg.Activity
            public void KWHzl(AbstractC54779xV abstractC54779xV) {
                this.AkhnZx = abstractC54779xV;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void OLrzqt(java.lang.String str) {
                this.values = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void OLrzqt(DL dl) {
                this.valueOf = dl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC57207ye copydefault() {
                return this.EZpvd.copydefault();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.Boolean bool) {
                this.AuCTel = bool;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public void copydefault(java.lang.String str) {
                this.KWHzl = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WebResourceResponse djBIcL() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC5093El<java.lang.Object> ejfBZ() {
                return this.DbNXlk;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fIwbmz() {
                return this.fIwbmz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.Boolean fJNWhG() {
                return this.AuCTel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DL fetchVPNInfo() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.Ab>, java.util.List<o.Ab> */
            public java.util.List<InterfaceC2861Ab> gEmmrt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public InterfaceC54806xW isConnected() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WebMessagePort valueOf() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FilterInputStream.Application
            public java.lang.String values() {
                return this.values;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.InterfaceC5183Hx
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public TaskDescription OLrzqt() {
                return new TaskDescription(this, null);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object createFaceLivenessSession$default(UrlInterceptRegistry urlInterceptRegistry, Checkable checkable, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFaceLivenessSession");
            }
            if ((i & 1) != 0) {
                checkable = Checkable.AEQbTJ.OLrzqt(new Function1<Checkable.ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.RekognitionClient$createFaceLivenessSession$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Checkable.ActionBar actionBar) {
                        Intrinsics.checkNotNullParameter(actionBar, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Checkable.ActionBar actionBar) {
                        invoke2(actionBar);
                        return Unit.INSTANCE;
                    }
                });
            }
            return urlInterceptRegistry.OLrzqt(checkable, (Continuation<? super CalendarViewMaterialDelegate>) continuation);
        }

        public static /* synthetic */ java.lang.Object describeProjects$default(UrlInterceptRegistry urlInterceptRegistry, LinearLayout linearLayout, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: describeProjects");
            }
            if ((i & 1) != 0) {
                linearLayout = LinearLayout.EZpvd.AEQbTJ(new Function1<LinearLayout.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.RekognitionClient$describeProjects$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LinearLayout.StateListAnimator stateListAnimator) {
                        Intrinsics.checkNotNullParameter(stateListAnimator, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LinearLayout.StateListAnimator stateListAnimator) {
                        invoke2(stateListAnimator);
                        return Unit.INSTANCE;
                    }
                });
            }
            return urlInterceptRegistry.EZpvd(linearLayout, (Continuation<? super Magnifier>) continuation);
        }

        public static /* synthetic */ java.lang.Object listCollections$default(UrlInterceptRegistry urlInterceptRegistry, D d, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listCollections");
            }
            if ((i & 1) != 0) {
                d = D.EZpvd.KWHzl(new Function1<D.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.RekognitionClient$listCollections$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull D.StateListAnimator stateListAnimator) {
                        Intrinsics.checkNotNullParameter(stateListAnimator, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(D.StateListAnimator stateListAnimator) {
                        invoke2(stateListAnimator);
                        return Unit.INSTANCE;
                    }
                });
            }
            return urlInterceptRegistry.EZpvd(d, (Continuation<? super B>) continuation);
        }

        public static /* synthetic */ java.lang.Object listMediaAnalysisJobs$default(UrlInterceptRegistry urlInterceptRegistry, O o2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listMediaAnalysisJobs");
            }
            if ((i & 1) != 0) {
                o2 = O.OLrzqt.AEQbTJ(new Function1<O.Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.RekognitionClient$listMediaAnalysisJobs$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull O.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(O.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }
                });
            }
            return urlInterceptRegistry.KWHzl(o2, (Continuation<? super L>) continuation);
        }

        public static /* synthetic */ java.lang.Object listStreamProcessors$default(UrlInterceptRegistry urlInterceptRegistry, P p, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listStreamProcessors");
            }
            if ((i & 1) != 0) {
                p = P.EZpvd.EZpvd(new Function1<P.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.RekognitionClient$listStreamProcessors$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull P.StateListAnimator stateListAnimator) {
                        Intrinsics.checkNotNullParameter(stateListAnimator, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(P.StateListAnimator stateListAnimator) {
                        invoke2(stateListAnimator);
                        return Unit.INSTANCE;
                    }
                });
            }
            return urlInterceptRegistry.KWHzl(p, (Continuation<? super U>) continuation);
        }
    }
}

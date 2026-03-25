package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.widgets.inputpanel.IMInputPanel$onAttachedToWindow$1$1;
import com.okinc.im.widgets.inputpanel.InputMode;
import com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C35399nuc;
import o.C35935oJd;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35934oJc extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public android.view.ViewPropertyAnimator AEQbTJ;
    public Function1<? super InputMode, Unit> AYXKKw;
    public Function0<? extends ObserveKeyboardInputStateUseCase.KeyboardInputState> AhwBna;
    public Function0<Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public final MutableStateFlow<C35935oJd.Application> copydefault;
    public final StateFlow<C35935oJd.Application> djBIcL;
    public Job gEmmrt;
    public final nOZ isConnected;
    public Function2<? super java.lang.Integer, ? super android.view.ViewGroup, Unit> valueOf;

    /* JADX INFO: renamed from: o.oJc$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputMode.values().length];
            try {
                iArr[InputMode.StickerMode.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InputMode.TextInput.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35934oJc(@NotNull android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35934oJc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35934oJc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C35935oJd.Application> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickSendButton(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickStopButton(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnInputModeChange(Function1<? super InputMode, Unit> function1) {
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPostAnimateAddButton(Function2<? super java.lang.Integer, ? super android.view.ViewGroup, Unit> function2) {
        this.valueOf = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnProduceKeyboardInputState(@NotNull Function0<? extends ObserveKeyboardInputStateUseCase.KeyboardInputState> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AhwBna = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int, int):void (m)] (LINE:38) call: o.oJc.<init>(android.content.Context, android.util.AttributeSet, int, int):void type: THIS */
    public /* synthetic */ C35934oJc(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35934oJc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        java.lang.String string;
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = new Function0() { // from class: o.oJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35934oJc.KWHzl();
            }
        };
        nOZ nozOLrzqt = nOZ.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(nozOLrzqt, "");
        this.isConnected = nozOLrzqt;
        C35935oJd c35935oJd = C35935oJd.copydefault;
        MutableStateFlow<C35935oJd.Application> MutableStateFlow = StateFlowKt.MutableStateFlow(c35935oJd.AEQbTJ());
        this.copydefault = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35399nuc.VoiceInteractor.ejfBZ);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(C35399nuc.VoiceInteractor.fIwbmz, 0);
                if (resourceId == 0) {
                    string = typedArrayObtainStyledAttributes.getString(C35399nuc.VoiceInteractor.fIwbmz);
                } else {
                    string = context.getString(resourceId);
                }
                AEQbTJ(string);
                MutableStateFlow.setValue(c35935oJd.EZpvd(MutableStateFlow.getValue(), typedArrayObtainStyledAttributes.getBoolean(C35399nuc.VoiceInteractor.hDKMBd, true), typedArrayObtainStyledAttributes.getBoolean(C35399nuc.VoiceInteractor.fARcdN, false), typedArrayObtainStyledAttributes.getBoolean(C35399nuc.VoiceInteractor.fJNWhG, true)));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        DbNXlk();
    }

    /* JADX INFO: renamed from: o.oJc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oJc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final ObserveKeyboardInputStateUseCase.KeyboardInputState KWHzl() {
        return ObserveKeyboardInputStateUseCase.KeyboardInputState.AllowInput;
    }

    private final AppCompatActivity AkhnZx() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            android.content.Context contextOLrzqt = C58196ywi.OLrzqt(getContext());
            objM7377constructorimpl = Result.m7377constructorimpl(contextOLrzqt instanceof AppCompatActivity ? (AppCompatActivity) contextOLrzqt : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (AppCompatActivity) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final boolean valueOf() {
        try {
            Result.Application application = Result.Companion;
            AppCompatActivity appCompatActivityAkhnZx = AkhnZx();
            if (appCompatActivityAkhnZx == null) {
                return false;
            }
            return WindowInsetsCompat.toWindowInsetsCompat(appCompatActivityAkhnZx.getWindow().getDecorView().getRootView().getRootWindowInsets()).isVisible(WindowInsetsCompat.Type.ime());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = bool;
            }
            return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
        }
    }

    /* JADX INFO: renamed from: o.oJc$Fragment */
    public static final class Fragment implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Fragment() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            C35934oJc.this.copydefault.setValue(C35935oJd.copydefault.OLrzqt((C35935oJd.Application) C35934oJc.this.copydefault.getValue(), charSequence != null ? charSequence.toString() : null));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            this.gEmmrt = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new IMInputPanel$onAttachedToWindow$1$1(this, null), 3, null);
            this.copydefault.setValue(C35935oJd.copydefault.EZpvd(this.copydefault.getValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Job job = this.gEmmrt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.gEmmrt = null;
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.AEQbTJ;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.AEQbTJ = null;
    }

    public final android.widget.EditText djBIcL() {
        oIY oiy = this.isConnected.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(oiy, "");
        return oiy;
    }

    public final void setIsEnableVoiceButton(boolean z) {
        C35935oJd.Application value = this.copydefault.getValue();
        if (value.fetchVPNInfo() != z) {
            this.copydefault.setValue(C35935oJd.copydefault.KWHzl(value, z));
        }
    }

    public final void setIsEnableStickerButton(boolean z) {
        C35935oJd.Application value = this.copydefault.getValue();
        if (value.gEmmrt() != z) {
            this.copydefault.setValue(C35935oJd.copydefault.AEQbTJ(value, z));
        }
    }

    /* JADX INFO: renamed from: o.oJc$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C35934oJc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C35934oJc c35934oJc) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c35934oJc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.copydefault.setValue(C35935oJd.copydefault.OLrzqt((C35935oJd.Application) this.copydefault.copydefault.getValue()));
            }
        }
    }

    /* JADX INFO: renamed from: o.oJc$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C35934oJc KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C35934oJc c35934oJc) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c35934oJc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.copydefault.setValue(C35935oJd.copydefault.copydefault((C35935oJd.Application) this.KWHzl.copydefault.getValue()));
            }
        }
    }

    /* JADX INFO: renamed from: o.oJc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C35934oJc EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C35934oJc c35934oJc) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c35934oJc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault.setValue(C35935oJd.copydefault.AEQbTJ((C35935oJd.Application) this.EZpvd.copydefault.getValue()));
            }
        }
    }

    /* JADX INFO: renamed from: o.oJc$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C35934oJc KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C35934oJc c35934oJc) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c35934oJc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0<Unit> function0EZpvd = this.KWHzl.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.oJc$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C35934oJc EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C35934oJc c35934oJc) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c35934oJc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0<Unit> function0AhwBna = this.EZpvd.AhwBna();
                if (function0AhwBna != null) {
                    function0AhwBna.invoke();
                }
            }
        }
    }

    public final void setIsEnablePluginButton(boolean z) {
        C35935oJd.Application value = this.copydefault.getValue();
        if (value.valueOf() != z) {
            this.copydefault.setValue(C35935oJd.copydefault.copydefault(value, z));
        }
    }

    private final void AEQbTJ(java.lang.String str) {
        this.isConnected.OLrzqt.setHint(str);
    }

    public final void setState(@NotNull C35935oJd.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault.setValue(application);
    }

    public final void OLrzqt(C35935oJd.Application application, C35935oJd.Application application2) {
        Function1<? super InputMode, Unit> function1;
        if (application == null || application.AkhnZx() != application2.AkhnZx()) {
            this.isConnected.djBIcL.setSelected(application2.AkhnZx());
        }
        if (application == null || application.DbNXlk() != application2.DbNXlk()) {
            android.widget.ImageView imageView = this.isConnected.AhwBna;
            imageView.setSelected(application2.DbNXlk());
            imageView.setImageResource(application2.DbNXlk() ? C52761wXj.TaskDescription.DBAlnt : C52761wXj.TaskDescription.invokespecialRuDPQV);
        }
        if (application == null || application.AhwBna() != application2.AhwBna()) {
            this.isConnected.copydefault.setSelected(application2.AhwBna());
        }
        android.widget.FrameLayout frameLayout = this.isConnected.copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(application2.copydefault() ? 0 : 8);
        android.widget.ImageView imageView2 = this.isConnected.valueOf;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(application2.isConnected() ? 0 : 8);
        android.widget.ImageView imageView3 = this.isConnected.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(application2.AYXKKw() ? 0 : 8);
        android.widget.ImageView imageView4 = this.isConnected.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView4, "");
        imageView4.setVisibility(application2.values() ? 0 : 8);
        android.widget.ImageView imageView5 = this.isConnected.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        imageView5.setVisibility(application2.djBIcL() ? 0 : 8);
        if (application == null || application.KWHzl() != application2.KWHzl()) {
            int iKWHzl = application2.KWHzl();
            if (iKWHzl == 0) {
                AEQbTJ();
            } else if (iKWHzl == 1) {
                copydefault();
            }
        }
        EZpvd(application, application2);
        if ((application != null ? application.EZpvd() : null) == application2.EZpvd() || (function1 = this.AYXKKw) == null) {
            return;
        }
        function1.invoke(application2.EZpvd());
    }

    public final void setAgentProcessingState(@NotNull ObserveShowAgentProcessingFlow.AgentProcessingState agentProcessingState) {
        Intrinsics.checkNotNullParameter(agentProcessingState, "");
        this.copydefault.setValue(C35935oJd.copydefault.OLrzqt(this.copydefault.getValue(), agentProcessingState == ObserveShowAgentProcessingFlow.AgentProcessingState.WORKING || agentProcessingState == ObserveShowAgentProcessingFlow.AgentProcessingState.WORKING_STREAMING));
        this.isConnected.EZpvd.setEnabled(!(agentProcessingState == ObserveShowAgentProcessingFlow.AgentProcessingState.SENDING));
    }

    public final void DbNXlk() {
        nOZ noz = this.isConnected;
        oIY oiy = noz.OLrzqt;
        oiy.setShowSoftInputOnFocus(false);
        Intrinsics.copydefault(oiy);
        oiy.addTextChangedListener(new Fragment());
        oiy.setOnTouchListener(new View.OnTouchListener() { // from class: o.oIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C35934oJc.KWHzl(this.copydefault, view, motionEvent);
            }
        });
        android.widget.FrameLayout frameLayout = noz.copydefault;
        frameLayout.setOnClickListener(new Activity(frameLayout, 500L, this));
        android.widget.ImageView imageView = noz.djBIcL;
        imageView.setOnClickListener(new Application(imageView, 500L, this));
        android.widget.ImageView imageView2 = noz.AhwBna;
        imageView2.setOnClickListener(new ActionBar(imageView2, 500L, this));
        android.widget.ImageView imageView3 = noz.EZpvd;
        imageView3.setOnClickListener(new Dialog(imageView3, 500L, this));
        android.widget.ImageView imageView4 = noz.valueOf;
        imageView4.setOnClickListener(new LoaderManager(imageView4, 2000L, this));
    }

    public static final boolean KWHzl(C35934oJc c35934oJc, android.view.View view, android.view.MotionEvent motionEvent) {
        AppCompatActivity appCompatActivityAkhnZx;
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        C35935oJd.Application value = c35934oJc.copydefault.getValue();
        if (value.EZpvd() == InputMode.TextInput && !c35934oJc.valueOf() && (appCompatActivityAkhnZx = c35934oJc.AkhnZx()) != null) {
            c35934oJc.KWHzl(appCompatActivityAkhnZx);
        }
        c35934oJc.copydefault.setValue(C35935oJd.copydefault.KWHzl(value));
        return false;
    }

    public final void AEQbTJ(AppCompatActivity appCompatActivity) {
        C33570myu.AEQbTJ((android.content.Context) appCompatActivity, (android.view.View) this.isConnected.OLrzqt);
    }

    public final void KWHzl(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        if (appCompatActivity.getCurrentFocus() == null) {
            C33570myu.AEQbTJ(getContext(), (android.widget.EditText) this.isConnected.OLrzqt);
        } else {
            C33054mpH.EZpvd((android.app.Activity) appCompatActivity);
        }
    }

    public final C35935oJd.Application gEmmrt() {
        return this.copydefault.getValue();
    }

    public final void OLrzqt(@NotNull GeneralAction generalAction) {
        Intrinsics.checkNotNullParameter(generalAction, "");
        if (generalAction instanceof GeneralAction.SetTextToEditTextField) {
            this.isConnected.OLrzqt.setText(((GeneralAction.SetTextToEditTextField) generalAction).AEQbTJ());
            return;
        }
        if (generalAction instanceof GeneralAction.AppendTextToEditTextField) {
            java.lang.String strOLrzqt = ((GeneralAction.AppendTextToEditTextField) generalAction).OLrzqt();
            oIY oiy = this.isConnected.OLrzqt;
            android.text.Editable text = oiy.getText();
            if (text != null) {
                text.insert(oiy.getSelectionStart(), strOLrzqt);
                return;
            }
            return;
        }
        if (generalAction instanceof GeneralAction.DeleteLastCharacterFromEditTextField) {
            this.isConnected.OLrzqt.dispatchKeyEvent(new android.view.KeyEvent(0, 67));
        }
    }

    public final void AEQbTJ() {
        android.widget.ImageView imageView = this.isConnected.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (imageView.getRotation() == 135.0f) {
            return;
        }
        imageView.setPivotX(imageView.getWidth() / 2.0f);
        imageView.setPivotY(imageView.getHeight() / 2.0f);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.AEQbTJ;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = imageView.animate();
        viewPropertyAnimatorAnimate.setDuration(250L);
        viewPropertyAnimatorAnimate.setInterpolator(C33616mzn.OLrzqt);
        viewPropertyAnimatorAnimate.rotation(135.0f);
        viewPropertyAnimatorAnimate.withEndAction(new java.lang.Runnable() { // from class: o.oJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35934oJc.EZpvd(this.KWHzl);
            }
        });
        viewPropertyAnimatorAnimate.start();
        this.AEQbTJ = viewPropertyAnimatorAnimate;
    }

    public static final void EZpvd(C35934oJc c35934oJc) {
        c35934oJc.AEQbTJ = null;
        android.widget.FrameLayout frameLayout = c35934oJc.isConnected.copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        Function2<? super java.lang.Integer, ? super android.view.ViewGroup, Unit> function2 = c35934oJc.valueOf;
        if (function2 != null) {
            function2.invoke(1, frameLayout);
        }
    }

    public final void copydefault() {
        android.widget.ImageView imageView = this.isConnected.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setPivotX(imageView.getWidth() / 2.0f);
        imageView.setPivotY(imageView.getHeight() / 2.0f);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.AEQbTJ;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = imageView.animate();
        viewPropertyAnimatorAnimate.setDuration(250L);
        viewPropertyAnimatorAnimate.setInterpolator(C33616mzn.AEQbTJ);
        viewPropertyAnimatorAnimate.rotation(0.0f);
        viewPropertyAnimatorAnimate.withEndAction(new java.lang.Runnable() { // from class: o.oJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35934oJc.OLrzqt(this.KWHzl);
            }
        });
        viewPropertyAnimatorAnimate.start();
        this.AEQbTJ = viewPropertyAnimatorAnimate;
    }

    public static final void OLrzqt(C35934oJc c35934oJc) {
        c35934oJc.AEQbTJ = null;
        android.widget.FrameLayout frameLayout = c35934oJc.isConnected.copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        Function2<? super java.lang.Integer, ? super android.view.ViewGroup, Unit> function2 = c35934oJc.valueOf;
        if (function2 != null) {
            function2.invoke(0, frameLayout);
        }
    }

    public final void EZpvd(C35935oJd.Application application, C35935oJd.Application application2) {
        final AppCompatActivity appCompatActivityAkhnZx = AkhnZx();
        if (appCompatActivityAkhnZx == null) {
            return;
        }
        int i = TaskDescription.EZpvd[application2.EZpvd().ordinal()];
        if (i == 1) {
            this.isConnected.OLrzqt.clearFocus();
            AEQbTJ(appCompatActivityAkhnZx);
            return;
        }
        if (i == 2) {
            InputMode inputModeEZpvd = application != null ? application.EZpvd() : null;
            java.lang.String strAEQbTJ = application != null ? application.AEQbTJ() : null;
            java.lang.String strAEQbTJ2 = application2.AEQbTJ();
            InputMode inputMode = InputMode.TextInput;
            if (inputModeEZpvd != inputMode || Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) strAEQbTJ2)) {
                if (inputModeEZpvd == inputMode && valueOf()) {
                    return;
                }
                final oIY oiy = this.isConnected.OLrzqt;
                final Ref.IntRef intRef = new Ref.IntRef();
                final int i2 = 2;
                View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: o.oJf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(android.view.View view, boolean z) {
                        C35934oJc.OLrzqt(this.AEQbTJ, appCompatActivityAkhnZx, intRef, i2, oiy, view, z);
                    }
                };
                KWHzl(appCompatActivityAkhnZx);
                oiy.clearFocus();
                oiy.setOnFocusChangeListener(onFocusChangeListener);
                return;
            }
            return;
        }
        this.isConnected.OLrzqt.clearFocus();
        AEQbTJ(appCompatActivityAkhnZx);
    }

    public static final void OLrzqt(C35934oJc c35934oJc, AppCompatActivity appCompatActivity, Ref.IntRef intRef, int i, oIY oiy, android.view.View view, boolean z) {
        if (!z || c35934oJc.AhwBna.invoke() != ObserveKeyboardInputStateUseCase.KeyboardInputState.AllowInput) {
            c35934oJc.AEQbTJ(appCompatActivity);
        } else {
            c35934oJc.KWHzl(appCompatActivity);
        }
        int i2 = intRef.element + 1;
        intRef.element = i2;
        if (i2 == i) {
            oiy.setOnFocusChangeListener(null);
        }
    }
}

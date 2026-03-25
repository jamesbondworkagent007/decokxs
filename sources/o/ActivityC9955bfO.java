package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.assets.coinmanagement.SelectCoinActivity$initAppbarIcon$1$1;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C18012faP;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bfO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC9955bfO extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public InterfaceC58217yxC KWHzl;
    public AbstractC16421ejc OLrzqt;
    public AbstractC12782ctV copydefault;
    public boolean gEmmrt;
    public java.util.List<C13924dbk> valueOf;
    public long AEQbTJ = Long.MIN_VALUE;
    public java.lang.String djBIcL = "";

    /* JADX INFO: renamed from: o.bfO$Application */
    public interface Application {
        void OLrzqt(boolean z);
    }

    /* JADX INFO: renamed from: o.bfO$TaskDescription */
    public interface TaskDescription {
        void AEQbTJ(long j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV KWHzl() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.bfO$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bfO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC9955bfO.class);
            intent.putExtra("chain_id", j);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.OLrzqt = (AbstractC16421ejc) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.OBJEWx);
        C32866mlf.onEvent$default("Web3HomePage_Token_Manage_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        gEmmrt();
        OLrzqt();
        EZpvd();
    }

    /* JADX INFO: renamed from: o.bfO$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            if (editable == null || (string = editable.toString()) == null) {
                return;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = ActivityC9955bfO.this.getSupportFragmentManager().findFragmentByTag(C56524yIo.AEQbTJ(C10041bgv.class).valueOf());
            C10041bgv c10041bgv = fragmentFindFragmentByTag instanceof C10041bgv ? (C10041bgv) fragmentFindFragmentByTag : null;
            if (c10041bgv != null) {
                c10041bgv.KWHzl(string);
            }
        }
    }

    private final void gEmmrt() {
        this.AEQbTJ = getIntent().getLongExtra("chain_id", Long.MIN_VALUE);
    }

    public final void OLrzqt() {
        AbstractC16413ejU abstractC16413ejU;
        android.widget.ImageView imageView;
        AbstractC16421ejc abstractC16421ejc = this.OLrzqt;
        if (abstractC16421ejc != null && (abstractC16413ejU = abstractC16421ejc.EZpvd) != null && (imageView = abstractC16413ejU.OLrzqt) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.bfN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC9955bfO.copydefault(this.EZpvd, view);
                }
            });
        }
        AEQbTJ();
        copydefault();
    }

    public static final void copydefault(ActivityC9955bfO activityC9955bfO, android.view.View view) {
        java.lang.Object systemService = activityC9955bfO.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        activityC9955bfO.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[PHI: r0
  0x006a: PHI (r0v19 java.lang.String) = (r0v4 java.lang.String), (r0v8 java.lang.String), (r0v24 java.lang.String) binds: [B:41:0x0081, B:55:0x00aa, B:31:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ() {
        java.lang.String strValueOf;
        CustomChainCoinMeta customChainCoinMetaDjBIcL;
        java.lang.String strEjfBZ;
        java.lang.Character chWlaJM;
        java.lang.String string;
        AbstractC16413ejU abstractC16413ejU;
        android.widget.ImageView imageView;
        AbstractC16413ejU abstractC16413ejU2;
        android.widget.ImageView imageView2;
        AbstractC16413ejU abstractC16413ejU3;
        android.widget.ImageView imageView3;
        AbstractC16413ejU abstractC16413ejU4;
        android.widget.ImageView imageView4;
        long j = this.AEQbTJ;
        if (j == Long.MIN_VALUE) {
            AbstractC16421ejc abstractC16421ejc = this.OLrzqt;
            if (abstractC16421ejc != null && (abstractC16413ejU4 = abstractC16421ejc.EZpvd) != null && (imageView4 = abstractC16413ejU4.copydefault) != null) {
                imageView4.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
            }
            AbstractC16421ejc abstractC16421ejc2 = this.OLrzqt;
            if (abstractC16421ejc2 != null && (abstractC16413ejU3 = abstractC16421ejc2.EZpvd) != null && (imageView3 = abstractC16413ejU3.copydefault) != null) {
                imageView3.setImageResource(C52761wXj.TaskDescription.createSocket);
            }
            AbstractC16421ejc abstractC16421ejc3 = this.OLrzqt;
            if (abstractC16421ejc3 == null || (abstractC16413ejU2 = abstractC16421ejc3.EZpvd) == null || (imageView2 = abstractC16413ejU2.copydefault) == null) {
                return;
            }
            imageView2.setOnClickListener(new ActionBar(imageView2, 1000L, this));
            return;
        }
        java.lang.String str = "";
        if (j >= 0) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(this.AEQbTJ));
            strValueOf = c10854bwMKWHzl != null ? c10854bwMKWHzl.copydefault() : null;
            if (strValueOf != null) {
                str = strValueOf;
            }
        } else {
            C10598brV c10598brV = C10598brV.AEQbTJ;
            CustomChainMeta customChainMetaEZpvd = c10598brV.EZpvd(j);
            strValueOf = customChainMetaEZpvd != null ? customChainMetaEZpvd.valueOf() : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf)) {
                CustomChainMeta customChainMetaEZpvd2 = c10598brV.EZpvd(this.AEQbTJ);
                strValueOf = (customChainMetaEZpvd2 == null || (customChainCoinMetaDjBIcL = customChainMetaEZpvd2.djBIcL()) == null || (strEjfBZ = customChainCoinMetaDjBIcL.ejfBZ()) == null || (chWlaJM = C59454zhO.wlaJM(strEjfBZ)) == null || (string = chWlaJM.toString()) == null) ? null : C9700baY.OLrzqt(string);
                if (strValueOf != null) {
                }
            }
        }
        AEQbTJ(str);
        AbstractC16421ejc abstractC16421ejc4 = this.OLrzqt;
        if (abstractC16421ejc4 == null || (abstractC16413ejU = abstractC16421ejc4.EZpvd) == null || (imageView = abstractC16413ejU.copydefault) == null) {
            return;
        }
        imageView.setOnClickListener(null);
    }

    private final void copydefault() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C55230xfy c55230xfy2;
        C55230xfy c55230xfy3;
        C55230xfy c55230xfy4;
        C55230xfy c55230xfy5;
        android.widget.TextView textViewCopydefault;
        C55230xfy c55230xfy6;
        OKEditText oKEditTextKWHzl2;
        C55230xfy c55230xfy7;
        OKEditText oKEditTextKWHzl3;
        AbstractC16421ejc abstractC16421ejc = this.OLrzqt;
        if (abstractC16421ejc != null && (c55230xfy7 = abstractC16421ejc.copydefault) != null && (oKEditTextKWHzl3 = c55230xfy7.KWHzl()) != null) {
            oKEditTextKWHzl3.addTextChangedListener(new StateListAnimator());
        }
        AbstractC16421ejc abstractC16421ejc2 = this.OLrzqt;
        if (abstractC16421ejc2 != null && (c55230xfy6 = abstractC16421ejc2.copydefault) != null && (oKEditTextKWHzl2 = c55230xfy6.KWHzl()) != null) {
            oKEditTextKWHzl2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.bfX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                    return ActivityC9955bfO.KWHzl(this.KWHzl, textView, i, keyEvent);
                }
            });
        }
        AbstractC16421ejc abstractC16421ejc3 = this.OLrzqt;
        if (abstractC16421ejc3 != null && (c55230xfy5 = abstractC16421ejc3.copydefault) != null && (textViewCopydefault = c55230xfy5.copydefault()) != null) {
            textViewCopydefault.setText(getString(C13754dXa.FragmentManager.keySet));
        }
        AbstractC16421ejc abstractC16421ejc4 = this.OLrzqt;
        if (abstractC16421ejc4 != null && (c55230xfy4 = abstractC16421ejc4.copydefault) != null) {
            c55230xfy4.setShowCancelButton(false);
        }
        AbstractC16421ejc abstractC16421ejc5 = this.OLrzqt;
        if (abstractC16421ejc5 != null && (c55230xfy3 = abstractC16421ejc5.copydefault) != null) {
            c55230xfy3.setCancelCallback(new Function0() { // from class: o.bfW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC9955bfO.KWHzl(this.OLrzqt);
                }
            });
        }
        AbstractC16421ejc abstractC16421ejc6 = this.OLrzqt;
        if (abstractC16421ejc6 != null && (c55230xfy2 = abstractC16421ejc6.copydefault) != null) {
            c55230xfy2.setOnSearchBarClick(new Function0() { // from class: o.bfM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC9955bfO.OLrzqt(this.KWHzl);
                }
            });
        }
        AbstractC16421ejc abstractC16421ejc7 = this.OLrzqt;
        if (abstractC16421ejc7 == null || (c55230xfy = abstractC16421ejc7.copydefault) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) {
            return;
        }
        oKEditTextKWHzl.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.bfP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                ActivityC9955bfO.AEQbTJ(this.KWHzl, view, z);
            }
        });
    }

    public static final boolean KWHzl(ActivityC9955bfO activityC9955bfO, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 6 && i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
            return false;
        }
        java.lang.Object systemService = activityC9955bfO.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        return true;
    }

    /* JADX INFO: renamed from: o.bfO$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ActivityC9955bfO AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC9955bfO activityC9955bfO) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC9955bfO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("app_home_asset_coin_Mange_networkFilter_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new SelectCoinActivity$initAppbarIcon$1$1(this.AEQbTJ, null), 3, null);
            }
        }
    }

    public static final Unit KWHzl(ActivityC9955bfO activityC9955bfO) {
        C55230xfy c55230xfy;
        AbstractC16421ejc abstractC16421ejc = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc != null && (c55230xfy = abstractC16421ejc.copydefault) != null) {
            c55230xfy.clearFocus();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC9955bfO activityC9955bfO) {
        C55230xfy c55230xfy;
        AbstractC16421ejc abstractC16421ejc = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc != null && (c55230xfy = abstractC16421ejc.copydefault) != null) {
            c55230xfy.setSearchBarEditable(true);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ActivityC9955bfO activityC9955bfO, android.view.View view, boolean z) {
        C55230xfy c55230xfy;
        C55230xfy c55230xfy2;
        android.widget.TextView textViewCopydefault;
        C55230xfy c55230xfy3;
        android.widget.TextView textViewCopydefault2;
        C55230xfy c55230xfy4;
        if (z) {
            AbstractC16421ejc abstractC16421ejc = activityC9955bfO.OLrzqt;
            if (abstractC16421ejc != null && (c55230xfy4 = abstractC16421ejc.copydefault) != null) {
                c55230xfy4.setShowCancelButton(true);
            }
            AbstractC16421ejc abstractC16421ejc2 = activityC9955bfO.OLrzqt;
            ViewGroup.LayoutParams layoutParams = (abstractC16421ejc2 == null || (c55230xfy3 = abstractC16421ejc2.copydefault) == null || (textViewCopydefault2 = c55230xfy3.copydefault()) == null) ? null : textViewCopydefault2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(C55298xhM.KWHzl(8.0f, activityC9955bfO));
            }
            AbstractC16421ejc abstractC16421ejc3 = activityC9955bfO.OLrzqt;
            if (abstractC16421ejc3 != null && (c55230xfy2 = abstractC16421ejc3.copydefault) != null && (textViewCopydefault = c55230xfy2.copydefault()) != null) {
                textViewCopydefault.setLayoutParams(layoutParams);
            }
            if (activityC9955bfO.getSupportFragmentManager().findFragmentByTag(C56524yIo.AEQbTJ(C10041bgv.class).valueOf()) == null) {
                activityC9955bfO.getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.DcMfJKOmnske, C10041bgv.Companion.copydefault(activityC9955bfO.AEQbTJ, activityC9955bfO.gEmmrt), C56524yIo.AEQbTJ(C10041bgv.class).valueOf()).commitAllowingStateLoss();
                return;
            }
            return;
        }
        AbstractC16421ejc abstractC16421ejc4 = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc4 != null && (c55230xfy = abstractC16421ejc4.copydefault) != null) {
            c55230xfy.setShowCancelButton(false);
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = activityC9955bfO.getSupportFragmentManager().findFragmentByTag(C56524yIo.AEQbTJ(C10026bgg.class).valueOf());
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = C10026bgg.Companion.OLrzqt(activityC9955bfO.gEmmrt, activityC9955bfO.AEQbTJ);
        }
        activityC9955bfO.getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.DcMfJKOmnske, fragmentFindFragmentByTag, C56524yIo.AEQbTJ(C10026bgg.class).valueOf()).commitAllowingStateLoss();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.moe.subscribeOnIO$default(o.ywX, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, java.lang.Object):o.yxC */
    private final void EZpvd() {
        showLoading();
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.bfS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC9955bfO.OLrzqt(this.copydefault, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bfR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC9955bfO.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        this.KWHzl = C33024moe.subscribeOnIO$default(abstractC58185ywXKWHzl, new Function1() { // from class: o.bfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC9955bfO.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.bfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC9955bfO.KWHzl(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final InterfaceC60096zvd KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(final ActivityC9955bfO activityC9955bfO, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        activityC9955bfO.djBIcL = abstractC12782ctV.DbNXlk();
        activityC9955bfO.copydefault = abstractC12782ctV;
        AbstractC58185ywX<java.util.List<C13924dbk>> abstractC58185ywXGkJEwt = abstractC12782ctV.gkJEwt();
        final Function1 function1 = new Function1() { // from class: o.bfL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC9955bfO.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        };
        return abstractC58185ywXGkJEwt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bfQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC9955bfO.OLrzqt(function1, obj);
            }
        });
    }

    public static final java.lang.Boolean OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Boolean KWHzl(ActivityC9955bfO activityC9955bfO, java.util.List list) {
        java.lang.Object next;
        boolean z;
        Intrinsics.checkNotNullParameter(list, "");
        activityC9955bfO.valueOf = list;
        long j = activityC9955bfO.AEQbTJ;
        if (j == Long.MIN_VALUE) {
            z = !list.isEmpty();
        } else {
            if (j >= 0) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C13924dbk) next).OLrzqt().AEQbTJ() == activityC9955bfO.AEQbTJ) {
                        break;
                    }
                }
                if (next != null) {
                }
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final Unit KWHzl(ActivityC9955bfO activityC9955bfO, java.lang.Boolean bool) {
        C17089ewH c17089ewH;
        C55173xeu c55173xeuAEQbTJ;
        android.widget.FrameLayout frameLayout;
        C55230xfy c55230xfy;
        activityC9955bfO.dismissLoading();
        boolean zBooleanValue = bool.booleanValue();
        activityC9955bfO.gEmmrt = zBooleanValue;
        AbstractC16421ejc abstractC16421ejc = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc != null && (c55230xfy = abstractC16421ejc.copydefault) != null) {
            c55230xfy.setVisibility(zBooleanValue ? 0 : 8);
        }
        AbstractC16421ejc abstractC16421ejc2 = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc2 != null && (frameLayout = abstractC16421ejc2.AEQbTJ) != null) {
            frameLayout.setVisibility(0);
        }
        AbstractC16421ejc abstractC16421ejc3 = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc3 != null && (c17089ewH = abstractC16421ejc3.KWHzl) != null && (c55173xeuAEQbTJ = c17089ewH.getRoot()) != null) {
            c55173xeuAEQbTJ.setVisibility(8);
        }
        activityC9955bfO.getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.DcMfJKOmnske, C10026bgg.Companion.OLrzqt(activityC9955bfO.gEmmrt, activityC9955bfO.AEQbTJ), C56524yIo.AEQbTJ(C10026bgg.class).valueOf()).commitAllowingStateLoss();
        rVN.reportFullyDrawn$default((android.app.Activity) activityC9955bfO, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final ActivityC9955bfO activityC9955bfO, java.lang.Throwable th) {
        C17089ewH c17089ewH;
        C55173xeu c55173xeu;
        C17089ewH c17089ewH2;
        C55173xeu c55173xeuAEQbTJ;
        android.widget.FrameLayout frameLayout;
        C55230xfy c55230xfy;
        Intrinsics.checkNotNullParameter(th, "");
        activityC9955bfO.dismissLoading();
        AbstractC16421ejc abstractC16421ejc = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc != null && (c55230xfy = abstractC16421ejc.copydefault) != null) {
            c55230xfy.setVisibility(8);
        }
        AbstractC16421ejc abstractC16421ejc2 = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc2 != null && (frameLayout = abstractC16421ejc2.AEQbTJ) != null) {
            frameLayout.setVisibility(8);
        }
        AbstractC16421ejc abstractC16421ejc3 = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc3 != null && (c17089ewH2 = abstractC16421ejc3.KWHzl) != null && (c55173xeuAEQbTJ = c17089ewH2.getRoot()) != null) {
            c55173xeuAEQbTJ.setVisibility(0);
        }
        AbstractC16421ejc abstractC16421ejc4 = activityC9955bfO.OLrzqt;
        if (abstractC16421ejc4 != null && (c17089ewH = abstractC16421ejc4.KWHzl) != null && (c55173xeu = c17089ewH.OLrzqt) != null) {
            java.lang.String string = c55173xeu.getContext().getString(C13754dXa.FragmentManager.copydefault);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            java.lang.String string2 = c55173xeu.getContext().getString(C13754dXa.FragmentManager.QUSxYX);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu.setSubTitle((java.lang.CharSequence) string2);
            java.lang.String string3 = c55173xeu.getContext().getString(C13754dXa.FragmentManager.QbewEr);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c55173xeu.setRetry(string3);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.bfY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC9955bfO.KWHzl(this.AEQbTJ, view);
                }
            });
        }
        rVN.reportFullyDrawn$default((android.app.Activity) activityC9955bfO, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ActivityC9955bfO activityC9955bfO, android.view.View view) {
        activityC9955bfO.EZpvd();
    }

    public final void EZpvd(boolean z) {
        C55230xfy c55230xfy;
        AbstractC16421ejc abstractC16421ejc = this.OLrzqt;
        if (abstractC16421ejc == null || (c55230xfy = abstractC16421ejc.copydefault) == null) {
            return;
        }
        c55230xfy.setVisibility(z ? 0 : 8);
    }

    public final void copydefault(final C18012faP.ActionBar actionBar) {
        java.lang.String strOLrzqt;
        AbstractC16413ejU abstractC16413ejU;
        android.widget.ImageView imageView;
        AbstractC16413ejU abstractC16413ejU2;
        android.widget.ImageView imageView2;
        if (actionBar.gEmmrt()) {
            AbstractC16421ejc abstractC16421ejc = this.OLrzqt;
            if (abstractC16421ejc != null && (abstractC16413ejU2 = abstractC16421ejc.EZpvd) != null && (imageView2 = abstractC16413ejU2.copydefault) != null) {
                imageView2.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
            }
            AbstractC16421ejc abstractC16421ejc2 = this.OLrzqt;
            if (abstractC16421ejc2 != null && (abstractC16413ejU = abstractC16421ejc2.EZpvd) != null && (imageView = abstractC16413ejU.copydefault) != null) {
                Glide.KWHzl(imageView).OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.createSocket)).EZpvd(imageView);
            }
        } else {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) actionBar.EZpvd())) {
                strOLrzqt = actionBar.EZpvd();
            } else {
                strOLrzqt = C9700baY.OLrzqt(java.lang.String.valueOf(C59454zhO.wlaJM(actionBar.valueOf())));
            }
            AEQbTJ(strOLrzqt);
        }
        EZpvd(actionBar.OLrzqt());
        C32866mlf.onEvent$default("app_home_asset_coin_Mange_networkSelect_click", (TrackChannel[]) null, new Function1() { // from class: o.bfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC9955bfO.AEQbTJ(actionBar, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C18012faP.ActionBar actionBar, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("network", actionBar.KWHzl(), false));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ymb.loadFixSizeBorderImage$default(android.widget.ImageView, java.lang.String, int, float, float, int, java.lang.Object):void */
    public final void AEQbTJ(java.lang.String str) {
        AbstractC16413ejU abstractC16413ejU;
        android.widget.ImageView imageView;
        AbstractC16413ejU abstractC16413ejU2;
        android.widget.ImageView imageView2;
        AbstractC16421ejc abstractC16421ejc = this.OLrzqt;
        if (abstractC16421ejc != null && (abstractC16413ejU2 = abstractC16421ejc.EZpvd) != null && (imageView2 = abstractC16413ejU2.copydefault) != null) {
            imageView2.setImageTintList(null);
        }
        AbstractC16421ejc abstractC16421ejc2 = this.OLrzqt;
        if (abstractC16421ejc2 == null || (abstractC16413ejU = abstractC16421ejc2.EZpvd) == null || (imageView = abstractC16413ejU.copydefault) == null) {
            return;
        }
        C57659ymb.loadFixSizeBorderImage$default(imageView, str, C52761wXj.TaskDescription.fERRXa, 0.0f, 24.0f, 4, null);
    }

    public final void EZpvd(long j) {
        copydefault(j);
        java.util.List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        for (ActivityResultCaller activityResultCaller : fragments) {
            if (activityResultCaller instanceof TaskDescription) {
                ((TaskDescription) activityResultCaller).AEQbTJ(j);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(long j) {
        java.lang.Object next;
        boolean z;
        this.AEQbTJ = j;
        java.util.List<C13924dbk> list = this.valueOf;
        if (list != null) {
            if (j == Long.MIN_VALUE) {
                z = !list.isEmpty();
            } else {
                if (j >= 0) {
                    java.util.Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((C13924dbk) next).OLrzqt().AEQbTJ() == j) {
                                break;
                            }
                        }
                    }
                    if (next != null) {
                    }
                }
            }
            if (z != this.gEmmrt) {
                this.gEmmrt = z;
                AEQbTJ(z);
            }
        }
    }

    public final void AEQbTJ(boolean z) {
        java.util.List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        for (ActivityResultCaller activityResultCaller : fragments) {
            if (activityResultCaller instanceof Application) {
                ((Application) activityResultCaller).OLrzqt(z);
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

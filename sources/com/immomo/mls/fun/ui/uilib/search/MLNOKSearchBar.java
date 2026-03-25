package com.immomo.mls.fun.ui.uilib.search;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.search.MLNOKSearchBar;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33570myu;
import o.C52761wXj;
import o.C55189xfJ;
import o.C55230xfy;
import o.C55366xib;
import o.C7594aml;
import o.C7857arj;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKSearchBar extends UDView<View> implements TextWatcher, TextView.OnEditorActionListener {
    public C55189xfJ AYXKKw;
    public C55230xfy KWHzl;
    public final Integer[] copydefault;
    public boolean djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final String[] AEQbTJ = {"placeholder", "text", "setSize", "showCancelButton", "cancelText", "cancelCallback", "clearCallback", "setDidChangingCallback", "confirmCallback", "setSearchResultView", "openSeachfrom", "willOpenCallback", "dismiss", "showKeyboard", "dismissKeyboard"};
    public static final String OLrzqt = MLNOKSearchBar.class.getSimpleName();

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @InterfaceC60044zuT
    public MLNOKSearchBar(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.copydefault = new Integer[]{-4, -3};
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        boolean zCopydefault = C7594aml.copydefault(luaValueArr, 0, true);
        int i = C52761wXj.ActionBar.DLWbHP;
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        int iAEQbTJ = (int) C55366xib.AEQbTJ(i, contextAubY);
        if (zCopydefault) {
            Context contextAubY2 = AubY();
            Intrinsics.checkNotNullExpressionValue(contextAubY2, "");
            C55230xfy c55230xfy = new C55230xfy(contextAubY2, null, 0, 6, null);
            c55230xfy.setClearCallback(new Function0() { // from class: o.aoM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MLNOKSearchBar.EZpvd(this.KWHzl);
                }
            });
            c55230xfy.setPaddingRelative(iAEQbTJ, 0, iAEQbTJ, 0);
            c55230xfy.setOKDSSize(-3);
            this.KWHzl = c55230xfy;
            Intrinsics.copydefault(c55230xfy);
            return c55230xfy;
        }
        Context contextAubY3 = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY3, "");
        C55189xfJ c55189xfJ = new C55189xfJ(contextAubY3, null, 2, null);
        c55189xfJ.KWHzl(false);
        c55189xfJ.setSearchBarYOffset(C7857arj.valueOf(c55189xfJ.getContext()));
        c55189xfJ.setClearCallback(new Function0() { // from class: o.aoL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKSearchBar.KWHzl(this.OLrzqt);
            }
        });
        c55189xfJ.setPaddingRelative(iAEQbTJ, 0, iAEQbTJ, 0);
        c55189xfJ.setSize(-3);
        this.AYXKKw = c55189xfJ;
        Intrinsics.copydefault(c55189xfJ);
        return c55189xfJ;
    }

    public static final Unit EZpvd(MLNOKSearchBar mLNOKSearchBar) {
        mLNOKSearchBar.OLrzqt("");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MLNOKSearchBar mLNOKSearchBar) {
        mLNOKSearchBar.OLrzqt("");
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] cancelCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, OtpEventTracker.OTP_EVENT_VALUE_CANCEL, new UDView.TaskDescription() { // from class: o.aoB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSearchBar.valueOf(this.AEQbTJ, luaFunction);
            }
        });
        return null;
    }

    public static final Unit valueOf(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(MLNOKSearchBar mLNOKSearchBar, final LuaFunction luaFunction) {
        C55230xfy c55230xfy = mLNOKSearchBar.KWHzl;
        if (c55230xfy != null) {
            c55230xfy.setCancelCallback(new Function0() { // from class: o.aoE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MLNOKSearchBar.valueOf(luaFunction);
                }
            });
        }
        C55189xfJ c55189xfJ = mLNOKSearchBar.AYXKKw;
        if (c55189xfJ != null) {
            c55189xfJ.setCancelCallback(new Function0() { // from class: o.aoI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MLNOKSearchBar.AYXKKw(luaFunction);
                }
            });
        }
    }

    public static final Unit AYXKKw(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] clearCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, Web3SecurityTrackEvent.VALUE_CLEAR, new UDView.TaskDescription() { // from class: o.aoD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSearchBar.djBIcL(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final Unit AhwBna(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(MLNOKSearchBar mLNOKSearchBar, final LuaFunction luaFunction) {
        C55230xfy c55230xfy = mLNOKSearchBar.KWHzl;
        if (c55230xfy != null) {
            c55230xfy.setClearCallback(new Function0() { // from class: o.aoH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MLNOKSearchBar.AhwBna(luaFunction);
                }
            });
        }
        C55189xfJ c55189xfJ = mLNOKSearchBar.AYXKKw;
        if (c55189xfJ != null) {
            c55189xfJ.setClearCallback(new Function0() { // from class: o.aoG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MLNOKSearchBar.gEmmrt(luaFunction);
                }
            });
        }
    }

    public static final Unit gEmmrt(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSearchResultView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.aoy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSearchBar.copydefault(this.OLrzqt, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit copydefault(MLNOKSearchBar mLNOKSearchBar, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C55189xfJ c55189xfJ = mLNOKSearchBar.AYXKKw;
        if (c55189xfJ != null) {
            c55189xfJ.setCustomContentView(view);
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] openSeachfrom(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55189xfJ c55189xfJ = this.AYXKKw;
        if (c55189xfJ == null) {
            return null;
        }
        c55189xfJ.copydefault(false);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDidChangingCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "didChanging", new UDView.TaskDescription() { // from class: o.aoK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSearchBar.gEmmrt(this.KWHzl, luaFunction);
            }
        });
        return null;
    }

    public static final void gEmmrt(MLNOKSearchBar mLNOKSearchBar, LuaFunction luaFunction) {
        mLNOKSearchBar.AYXKKw();
    }

    @InterfaceC60044zuT
    public final LuaValue[] confirmCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, Web3SecurityTrackEvent.VALUE_CONFIRM, new UDView.TaskDescription() { // from class: o.aoz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSearchBar.AhwBna(this.EZpvd, luaFunction);
            }
        });
        return null;
    }

    public static final void AhwBna(MLNOKSearchBar mLNOKSearchBar, LuaFunction luaFunction) {
        EditText editTextEZpvd;
        C55230xfy c55230xfy = mLNOKSearchBar.KWHzl;
        if (c55230xfy != null && (editTextEZpvd = c55230xfy.EZpvd()) != null) {
            editTextEZpvd.setOnEditorActionListener(mLNOKSearchBar);
        }
        C55189xfJ c55189xfJ = mLNOKSearchBar.AYXKKw;
        if (c55189xfJ != null) {
            c55189xfJ.setOnEditorActionListener(mLNOKSearchBar);
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] willOpenCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "willOpen", new UDView.TaskDescription() { // from class: o.aoJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSearchBar.AYXKKw(this.EZpvd, luaFunction);
            }
        });
        return null;
    }

    public static final void AYXKKw(MLNOKSearchBar mLNOKSearchBar, final LuaFunction luaFunction) {
        C55189xfJ c55189xfJ = mLNOKSearchBar.AYXKKw;
        if (c55189xfJ != null) {
            c55189xfJ.setOnBeforeOpen(new Function0() { // from class: o.aoF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MLNOKSearchBar.isConnected(luaFunction);
                }
            });
        }
    }

    public static final Unit isConnected(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] dismiss(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55189xfJ c55189xfJ = this.AYXKKw;
        if (c55189xfJ == null) {
            return null;
        }
        c55189xfJ.copydefault();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] showKeyboard(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        f_().postDelayed(new Runnable() { // from class: o.aoC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                MLNOKSearchBar.AhwBna(this.OLrzqt);
            }
        }, 100L);
        return null;
    }

    public static final void AhwBna(MLNOKSearchBar mLNOKSearchBar) {
        C55230xfy c55230xfyEZpvd;
        EditText editTextEZpvd;
        EditText editTextEZpvd2;
        C55230xfy c55230xfy = mLNOKSearchBar.KWHzl;
        if (c55230xfy != null && (editTextEZpvd2 = c55230xfy.EZpvd()) != null) {
            C33570myu.AEQbTJ(mLNOKSearchBar.AubY(), editTextEZpvd2);
        }
        C55189xfJ c55189xfJ = mLNOKSearchBar.AYXKKw;
        if (c55189xfJ == null || (c55230xfyEZpvd = c55189xfJ.EZpvd()) == null || (editTextEZpvd = c55230xfyEZpvd.EZpvd()) == null) {
            return;
        }
        C33570myu.AEQbTJ(mLNOKSearchBar.AubY(), editTextEZpvd);
    }

    public final View AhwBna() {
        View focusedChild;
        View viewF_ = f_();
        if (viewF_.isFocused()) {
            return viewF_;
        }
        if ((viewF_ instanceof ViewGroup) && (focusedChild = ((ViewGroup) viewF_).getFocusedChild()) != null) {
            return focusedChild;
        }
        if (!(AubY() instanceof android.app.Activity)) {
            return null;
        }
        Context contextAubY = AubY();
        Intrinsics.copydefault(contextAubY, "");
        return ((android.app.Activity) contextAubY).getCurrentFocus();
    }

    @InterfaceC60044zuT
    public final LuaValue[] dismissKeyboard(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        try {
            View viewAhwBna = AhwBna();
            if (viewAhwBna == null) {
                return null;
            }
            Context contextAubY = AubY();
            Intrinsics.copydefault(contextAubY, "");
            C33570myu.OLrzqt((android.app.Activity) contextAubY, viewAhwBna);
            return null;
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return null;
        }
    }

    private final void AYXKKw() {
        EditText editTextEZpvd;
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        C55230xfy c55230xfy = this.KWHzl;
        if (c55230xfy != null && (editTextEZpvd = c55230xfy.EZpvd()) != null) {
            editTextEZpvd.addTextChangedListener(this);
        }
        C55189xfJ c55189xfJ = this.AYXKKw;
        if (c55189xfJ != null) {
            c55189xfJ.setTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        OLrzqt(editable != null ? editable.toString() : null);
    }

    public final void OLrzqt(String str) {
        LuaFunction luaFunctionAYXKKw = AYXKKw("didChanging");
        if (luaFunctionAYXKKw != null) {
            luaFunctionAYXKKw.invoke(LuaValue.varargsOf(LuaString.copydefault(str)));
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        CharSequence text;
        LuaFunction luaFunctionAYXKKw = AYXKKw(Web3SecurityTrackEvent.VALUE_CONFIRM);
        if (luaFunctionAYXKKw == null) {
            return false;
        }
        luaFunctionAYXKKw.copydefault((textView == null || (text = textView.getText()) == null) ? null : text.toString());
        return true;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.search.MLNOKSearchBar.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] OLrzqt() {
            return MLNOKSearchBar.AEQbTJ;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] placeholder(@NotNull LuaValue[] luaValueArr) {
        EditText editTextEZpvd;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        C55230xfy c55230xfy = this.KWHzl;
        if (c55230xfy != null && (editTextEZpvd = c55230xfy.EZpvd()) != null) {
            editTextEZpvd.setHint(javaString);
        }
        C55189xfJ c55189xfJ = this.AYXKKw;
        if (c55189xfJ == null) {
            return null;
        }
        c55189xfJ.setHintText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] text(@NotNull LuaValue[] luaValueArr) {
        String strAEQbTJ;
        CharSequence charSequenceAhwBna;
        String string;
        EditText editTextEZpvd;
        String str = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            C55230xfy c55230xfy = this.KWHzl;
            if (c55230xfy != null) {
                if (c55230xfy != null && (charSequenceAhwBna = c55230xfy.AhwBna()) != null && (string = charSequenceAhwBna.toString()) != null) {
                    str = string;
                }
                return LuaValue.rString(str);
            }
            C55189xfJ c55189xfJ = this.AYXKKw;
            if (c55189xfJ != null && (strAEQbTJ = c55189xfJ.AEQbTJ()) != null) {
                str = strAEQbTJ;
            }
            return LuaValue.rString(str);
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        C55230xfy c55230xfy2 = this.KWHzl;
        if (c55230xfy2 != null && (editTextEZpvd = c55230xfy2.EZpvd()) != null) {
            editTextEZpvd.setText(javaString);
            editTextEZpvd.setSelection(javaString.length());
        }
        C55189xfJ c55189xfJ2 = this.AYXKKw;
        if (c55189xfJ2 == null) {
            return null;
        }
        c55189xfJ2.setText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(this.copydefault, luaValue.toInt());
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        C55230xfy c55230xfy = this.KWHzl;
        if (c55230xfy != null) {
            c55230xfy.setOKDSSize(iIntValue);
        }
        C55189xfJ c55189xfJ = this.AYXKKw;
        if (c55189xfJ == null) {
            return null;
        }
        c55189xfJ.setSize(iIntValue);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] showCancelButton(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        boolean z = luaValue.toBoolean();
        C55230xfy c55230xfy = this.KWHzl;
        if (c55230xfy == null) {
            return null;
        }
        c55230xfy.setShowCancelButton(z);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] cancelText(@NotNull LuaValue[] luaValueArr) {
        TextView textViewCopydefault;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        C55230xfy c55230xfy = this.KWHzl;
        if (c55230xfy != null && (textViewCopydefault = c55230xfy.copydefault()) != null) {
            textViewCopydefault.setText(javaString);
        }
        C55189xfJ c55189xfJ = this.AYXKKw;
        if (c55189xfJ == null) {
            return null;
        }
        c55189xfJ.setCancelText(javaString);
        return null;
    }
}

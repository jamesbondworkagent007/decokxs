package com.okinc.widget.dialog.data;

import android.view.View;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.okinc.widget.dialog.data.BaseLeftRightCommonDialogBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mPD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public class BaseLeftRightCommonDialogBean extends BaseObservable {
    public static final int $stable = 8;
    private final Function1<View, Unit> cancelCallBack;
    private final Function1<View, Unit> closeCallBack;
    private String leftButton;
    private final Function1<View, Unit> okCallBack;
    private String rightButton;
    private boolean showCloseButton;
    private boolean singelButton;
    private String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseLeftRightCommonDialogBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<View, Unit> getCancelCallBack() {
        return this.cancelCallBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<View, Unit> getCloseCallBack() {
        return this.closeCallBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Bindable
    public final String getLeftButton() {
        return this.leftButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<View, Unit> getOkCallBack() {
        return this.okCallBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Bindable
    public final String getRightButton() {
        return this.rightButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Bindable
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Bindable
    public final boolean getSingelButton() {
        return this.singelButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Bindable
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseLeftRightCommonDialogBean(@NotNull Function1<? super View, Unit> function1, @NotNull Function1<? super View, Unit> function12, @NotNull Function1<? super View, Unit> function13) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.closeCallBack = function1;
        this.okCallBack = function12;
        this.cancelCallBack = function13;
        this.title = "";
        this.leftButton = "";
        this.rightButton = "";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:13) call: o.ymt.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: o.ymv.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0012: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: o.ymz.<init>():void type: CONSTRUCTOR) : (r3v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>):void (m)] (LINE:13) call: com.okinc.widget.dialog.data.BaseLeftRightCommonDialogBean.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ BaseLeftRightCommonDialogBean(Function1 function1, Function1 function12, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: o.ymt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseLeftRightCommonDialogBean._init_$lambda$0((android.view.View) obj);
            }
        } : function1, (i & 2) != 0 ? new Function1() { // from class: o.ymv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseLeftRightCommonDialogBean._init_$lambda$1((android.view.View) obj);
            }
        } : function12, (i & 4) != 0 ? new Function1() { // from class: o.ymz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseLeftRightCommonDialogBean._init_$lambda$2((android.view.View) obj);
            }
        } : function13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) this.title, (Object) str)) {
            return;
        }
        this.title = str;
        notifyPropertyChanged(mPD.gEmmrt);
    }

    public final void setLeftButton(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) this.leftButton, (Object) str)) {
            return;
        }
        this.leftButton = str;
        notifyPropertyChanged(mPD.OLrzqt);
    }

    public final void setRightButton(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) this.rightButton, (Object) str)) {
            return;
        }
        this.rightButton = str;
        notifyPropertyChanged(mPD.copydefault);
    }

    public void setOKClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.okCallBack.invoke(view);
    }

    public void setCancelClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.cancelCallBack.invoke(view);
    }

    public void setCloseClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.closeCallBack.invoke(view);
    }

    public final void setShowCloseButton(boolean z) {
        if (this.showCloseButton != z) {
            this.showCloseButton = z;
            notifyPropertyChanged(mPD.AhwBna);
        }
    }

    public final void setSingelButton(boolean z) {
        if (this.singelButton != z) {
            this.singelButton = z;
            notifyPropertyChanged(mPD.valueOf);
        }
    }
}

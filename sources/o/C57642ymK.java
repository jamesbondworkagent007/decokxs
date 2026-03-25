package o;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57642ymK extends androidx.fragment.app.DialogFragment {
    public mPH AYXKKw;
    public Function0<Unit> AhwBna;
    public java.lang.Integer AuCTel;
    public java.lang.String AuCTelauCTel;
    public int AubY;
    public int AxsJAY;
    public Function0<Unit> DbNXlk;
    public java.lang.Integer EZpvd;
    public java.lang.String KWHzl;
    public java.lang.Boolean ejfBZ;
    public java.lang.Boolean fARcdN;
    public java.lang.Integer fIwbmz;
    public java.lang.Integer fJNWhG;
    public Function0<Unit> gEmmrt;
    public java.lang.Integer getFieldNames;
    public java.lang.String getNewProxyInstance;
    public java.lang.Integer hDKMBd;
    public InterfaceC58217yxC isConnected;
    public float iwGUEr;
    public java.lang.Integer sSMYrx;
    public java.lang.Integer uzCIH;
    public java.lang.String valueOf;
    public int values;
    public Function0<Unit> wlaJM;
    public java.lang.Integer zLjUOn;
    public float zsXlph;
    public java.lang.Integer zuBGHE;
    public java.util.List<android.view.View> djBIcL = new java.util.ArrayList(0);
    public long fetchVPNInfo = 5;
    public boolean AkhnZx = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(float f) {
        this.zsXlph = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AubY = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getNewProxyInstance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AYXKKw() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AhwBna() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(float f) {
        this.iwGUEr = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTelauCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(long j) {
        this.fetchVPNInfo = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.AxsJAY = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.DbNXlk = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mPH copydefault() {
        return this.AYXKKw;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, C52761wXj.LoaderManager.DarRvM);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        mPH mph = (mPH) DataBindingUtil.inflate(layoutInflater, C32113mPz.Fragment.valueOf, viewGroup, false);
        this.AYXKKw = mph;
        if (mph != null) {
            return mph.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.ImageView imageView;
        android.view.View root;
        android.widget.ImageView imageView2;
        android.view.View root2;
        android.widget.ImageView imageView3;
        android.view.View root3;
        android.widget.ImageView imageView4;
        android.view.View root4;
        android.widget.ImageView imageView5;
        android.view.View root5;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        mPH mph;
        android.view.View root6;
        android.view.View root7;
        android.view.View root8;
        android.widget.ImageView imageView6;
        mPH mph2;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.TextView textView7;
        mPH mph3;
        android.widget.TextView textView8;
        android.widget.TextView textView9;
        mPH mph4;
        android.widget.TextView textView10;
        android.widget.TextView textView11;
        android.widget.ImageView imageView7;
        android.view.View root9;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int i = this.AxsJAY;
        if (i == 0) {
            mPH mph5 = this.AYXKKw;
            if (mph5 != null && (root9 = mph5.getRoot()) != null) {
                root9.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.zpGcln));
            }
            mPH mph6 = this.AYXKKw;
            if (mph6 != null && (imageView7 = mph6.OLrzqt) != null) {
                imageView7.setVisibility(8);
            }
        } else if (i == 1) {
            mPH mph7 = this.AYXKKw;
            if (mph7 != null && (root5 = mph7.getRoot()) != null) {
                root5.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.zpGcln));
            }
            mPH mph8 = this.AYXKKw;
            if (mph8 != null && (imageView5 = mph8.OLrzqt) != null) {
                imageView5.setVisibility(0);
            }
        } else if (i == 2) {
            mPH mph9 = this.AYXKKw;
            if (mph9 != null && (root4 = mph9.getRoot()) != null) {
                root4.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.QfZsXX));
            }
            mPH mph10 = this.AYXKKw;
            if (mph10 != null && (imageView4 = mph10.OLrzqt) != null) {
                imageView4.setVisibility(0);
            }
        } else if (i == 3) {
            mPH mph11 = this.AYXKKw;
            if (mph11 != null && (root3 = mph11.getRoot()) != null) {
                root3.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.DuR));
            }
            mPH mph12 = this.AYXKKw;
            if (mph12 != null && (imageView3 = mph12.OLrzqt) != null) {
                imageView3.setVisibility(0);
            }
        } else if (i == 4) {
            mPH mph13 = this.AYXKKw;
            if (mph13 != null && (root2 = mph13.getRoot()) != null) {
                root2.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.getLocation));
            }
            mPH mph14 = this.AYXKKw;
            if (mph14 != null && (imageView2 = mph14.OLrzqt) != null) {
                imageView2.setVisibility(0);
            }
        } else {
            mPH mph15 = this.AYXKKw;
            if (mph15 != null && (root = mph15.getRoot()) != null) {
                root.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.zpGcln));
            }
            mPH mph16 = this.AYXKKw;
            if (mph16 != null && (imageView = mph16.OLrzqt) != null) {
                imageView.setVisibility(8);
            }
        }
        mPH mph17 = this.AYXKKw;
        AEQbTJ(mph17 != null ? mph17.OLrzqt : null);
        mPH mph18 = this.AYXKKw;
        KWHzl(mph18 != null ? mph18.EZpvd : null);
        mPH mph19 = this.AYXKKw;
        if (mph19 != null && (textView11 = mph19.valueOf) != null) {
            textView11.setText(this.AuCTelauCTel);
        }
        java.lang.Integer num = this.zuBGHE;
        if (num != null && (mph4 = this.AYXKKw) != null && (textView10 = mph4.valueOf) != null) {
            Intrinsics.copydefault(num);
            textView10.setTextColor(num.intValue());
        }
        java.lang.String str = this.getNewProxyInstance;
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            mPH mph20 = this.AYXKKw;
            if (mph20 != null && (textView = mph20.djBIcL) != null) {
                textView.setVisibility(8);
            }
        } else {
            mPH mph21 = this.AYXKKw;
            if (mph21 != null && (textView9 = mph21.djBIcL) != null) {
                textView9.setText(this.getNewProxyInstance);
            }
        }
        java.lang.Integer num2 = this.getFieldNames;
        if (num2 != null && (mph3 = this.AYXKKw) != null && (textView8 = mph3.djBIcL) != null) {
            Intrinsics.copydefault(num2);
            textView8.setTextColor(num2.intValue());
        }
        java.lang.String str2 = this.KWHzl;
        if (str2 != null) {
            mPH mph22 = this.AYXKKw;
            if (mph22 != null && (textView7 = mph22.copydefault) != null) {
                textView7.setText(str2);
            }
            mPH mph23 = this.AYXKKw;
            if (mph23 != null && (textView6 = mph23.copydefault) != null) {
                textView6.setOnClickListener(new View.OnClickListener() { // from class: o.ymH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C57642ymK.copydefault(this.AEQbTJ, view2);
                    }
                });
            }
        } else {
            mPH mph24 = this.AYXKKw;
            if (mph24 != null && (textView2 = mph24.copydefault) != null) {
                textView2.setVisibility(8);
            }
        }
        java.lang.String str3 = this.valueOf;
        if (str3 != null) {
            mPH mph25 = this.AYXKKw;
            if (mph25 != null && (textView5 = mph25.AhwBna) != null) {
                textView5.setText(str3);
            }
            mPH mph26 = this.AYXKKw;
            if (mph26 != null && (textView4 = mph26.AhwBna) != null) {
                textView4.setOnClickListener(new View.OnClickListener() { // from class: o.ymI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C57642ymK.djBIcL(this.EZpvd, view2);
                    }
                });
            }
        } else {
            mPH mph27 = this.AYXKKw;
            if (mph27 != null && (textView3 = mph27.AhwBna) != null) {
                textView3.setVisibility(8);
            }
        }
        if (this.djBIcL.size() > 0) {
            for (android.view.View view2 : this.djBIcL) {
                mPH mph28 = this.AYXKKw;
                if (mph28 != null && (linearLayout2 = mph28.AEQbTJ) != null) {
                    linearLayout2.addView(view2);
                }
            }
        }
        if (this.KWHzl == null && this.valueOf == null && this.djBIcL.size() == 0 && (mph2 = this.AYXKKw) != null && (linearLayout = mph2.AEQbTJ) != null) {
            linearLayout.setVisibility(8);
        }
        mPH mph29 = this.AYXKKw;
        if (mph29 != null && (imageView6 = mph29.EZpvd) != null) {
            imageView6.setOnClickListener(new View.OnClickListener() { // from class: o.ymL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    C57642ymK.AhwBna(this.EZpvd, view3);
                }
            });
        }
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(this.fetchVPNInfo, java.util.concurrent.TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: o.ymJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57642ymK.EZpvd(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ymQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57642ymK.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ymP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57642ymK.EZpvd((java.lang.Throwable) obj);
            }
        };
        this.isConnected = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ymO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57642ymK.OLrzqt(function12, obj);
            }
        });
        mPH mph30 = this.AYXKKw;
        if (mph30 != null && (root8 = mph30.getRoot()) != null) {
            root8.setOnClickListener(new View.OnClickListener() { // from class: o.ymN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    C57642ymK.gEmmrt(this.copydefault, view3);
                }
            });
        }
        mPH mph31 = this.AYXKKw;
        if (mph31 != null && (root7 = mph31.getRoot()) != null) {
            root7.setOnTouchListener(new ActionBar());
        }
        java.lang.Integer numValueOf = this.AuCTel;
        if (numValueOf == null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            numValueOf = java.lang.Integer.valueOf(C33052mpF.EZpvd(15.0f, contextRequireContext));
        }
        java.lang.Integer numValueOf2 = this.zLjUOn;
        if (numValueOf2 == null) {
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            numValueOf2 = java.lang.Integer.valueOf(C33052mpF.EZpvd(15.0f, contextRequireContext2));
        }
        java.lang.Integer numValueOf3 = this.sSMYrx;
        if (numValueOf3 == null) {
            android.content.Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            numValueOf3 = java.lang.Integer.valueOf(C33052mpF.EZpvd(10.0f, contextRequireContext3));
        }
        java.lang.Integer numValueOf4 = this.EZpvd;
        if (numValueOf4 == null) {
            android.content.Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            numValueOf4 = java.lang.Integer.valueOf(C33052mpF.EZpvd(10.0f, contextRequireContext4));
        }
        if (numValueOf == null || numValueOf3 == null || numValueOf2 == null || numValueOf4 == null || (mph = this.AYXKKw) == null || (root6 = mph.getRoot()) == null) {
            return;
        }
        root6.setPaddingRelative(numValueOf.intValue(), numValueOf3.intValue(), numValueOf2.intValue(), numValueOf4.intValue());
    }

    public static final void copydefault(C57642ymK c57642ymK, android.view.View view) {
        Function0<Unit> function0 = c57642ymK.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
        c57642ymK.dismissAllowingStateLoss();
    }

    public static final void djBIcL(C57642ymK c57642ymK, android.view.View view) {
        Function0<Unit> function0 = c57642ymK.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
        c57642ymK.dismissAllowingStateLoss();
    }

    public static final void AhwBna(C57642ymK c57642ymK, android.view.View view) {
        c57642ymK.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C57642ymK c57642ymK, java.lang.Long l) {
        c57642ymK.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(C57642ymK c57642ymK, android.view.View view) {
        Function0<Unit> function0 = c57642ymK.wlaJM;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.ymK$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public final class ActionBar implements View.OnTouchListener {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                C57642ymK.this.AEQbTJ(motionEvent.getY());
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                if (view != null) {
                    C57642ymK c57642ymK = C57642ymK.this;
                    c57642ymK.EZpvd(motionEvent.getY() - c57642ymK.AYXKKw());
                    c57642ymK.AEQbTJ(motionEvent.getY());
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Intrinsics.copydefault(layoutParams, "");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams.topMargin < 0 || c57642ymK.AhwBna() < 0.0f) {
                        marginLayoutParams.topMargin = (int) (view.getTop() + c57642ymK.AhwBna());
                        view.setLayoutParams(marginLayoutParams);
                    }
                }
            } else if (((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) && view != null) {
                C57642ymK c57642ymK2 = C57642ymK.this;
                int i = -view.getTop();
                android.view.View view2 = c57642ymK2.getView();
                Intrinsics.copydefault(view2);
                if (i > view2.getMeasuredHeight() / 4) {
                    c57642ymK2.dismiss();
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                Intrinsics.copydefault(layoutParams2, "");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = 0;
                view.setLayoutParams(marginLayoutParams2);
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStart() {
        android.view.Window window;
        super.onStart();
        if (this.fJNWhG == null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            this.fJNWhG = java.lang.Integer.valueOf(C33052mpF.EZpvd(24.0f, contextRequireContext));
        }
        if (this.uzCIH == null) {
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            this.uzCIH = java.lang.Integer.valueOf(C33052mpF.EZpvd(24.0f, contextRequireContext2));
        }
        if (this.fIwbmz == null) {
            this.fIwbmz = 0;
        }
        if (this.hDKMBd == null) {
            this.hDKMBd = 0;
        }
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        C33567myr.AEQbTJ(window);
        window.setFlags(32, 32);
        window.setLayout(-1, -2);
        window.setDimAmount(0.0f);
        android.graphics.drawable.Drawable background = window.getDecorView().getBackground();
        if (background instanceof InsetDrawable) {
            InsetDrawable insetDrawable = (InsetDrawable) background;
            if (insetDrawable.getDrawable() instanceof GradientDrawable) {
                android.graphics.drawable.Drawable drawable = insetDrawable.getDrawable();
                Intrinsics.copydefault(drawable, "");
                android.content.Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                ((GradientDrawable) drawable).setCornerRadius(C33052mpF.AEQbTJ(8.0f, contextRequireContext3));
            }
            java.lang.Boolean bool = this.fARcdN;
            if (bool != null) {
                Intrinsics.copydefault(bool);
                if (bool.booleanValue()) {
                    java.lang.Integer num = this.fJNWhG;
                    Intrinsics.copydefault(num);
                    int iIntValue = num.intValue();
                    java.lang.Integer num2 = this.uzCIH;
                    Intrinsics.copydefault(num2);
                    if (iIntValue > num2.intValue()) {
                        this.uzCIH = this.fJNWhG;
                    } else {
                        this.fJNWhG = this.uzCIH;
                    }
                }
            }
            android.graphics.drawable.Drawable drawable2 = insetDrawable.getDrawable();
            java.lang.Integer num3 = this.fJNWhG;
            Intrinsics.copydefault(num3);
            int iIntValue2 = num3.intValue();
            java.lang.Integer num4 = this.uzCIH;
            Intrinsics.copydefault(num4);
            window.setBackgroundDrawable(new InsetDrawable(drawable2, iIntValue2, 0, num4.intValue(), 0));
        }
        java.lang.Boolean bool2 = this.ejfBZ;
        if (bool2 != null) {
            Intrinsics.copydefault(bool2);
            if (bool2.booleanValue()) {
                window.setGravity(16);
            } else {
                window.setGravity(48);
            }
        }
        int i = this.values;
        if (i != 0) {
            window.setGravity(i);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.gravity & 48) == 48) {
            java.lang.Integer num5 = this.hDKMBd;
            attributes.y = num5 != null ? num5.intValue() : attributes.y;
            window.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        return new android.app.Dialog(requireContext());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.DbNXlk;
        if (function0 != null) {
            function0.invoke();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public void AEQbTJ(android.widget.ImageView imageView) {
        int i = this.AubY;
        if (i == 0) {
            if (imageView != null) {
                imageView.setBackgroundResource(0);
                return;
            }
            return;
        }
        if (i == 1) {
            if (imageView != null) {
                imageView.setBackgroundResource(C32113mPz.TaskDescription.DbNXlk);
                return;
            }
            return;
        }
        if (i == 2) {
            if (imageView != null) {
                imageView.setBackgroundResource(C32113mPz.TaskDescription.AkhnZx);
            }
        } else if (i == 3) {
            if (imageView != null) {
                imageView.setBackgroundResource(C32113mPz.TaskDescription.djBIcL);
            }
        } else if (i == 4) {
            if (imageView != null) {
                imageView.setBackgroundResource(C32113mPz.TaskDescription.gEmmrt);
            }
        } else if (i == 5 && imageView != null) {
            imageView.setBackgroundResource(C32113mPz.TaskDescription.isConnected);
        }
    }

    public void KWHzl(android.widget.ImageView imageView) {
        if (imageView != null) {
            imageView.setVisibility(this.AkhnZx ? 0 : 8);
        }
    }

    public final void KWHzl(int i) {
        this.hDKMBd = java.lang.Integer.valueOf(i);
    }

    public final void copydefault(int i, int i2, int i3, int i4) {
        this.AuCTel = java.lang.Integer.valueOf(i);
        this.zLjUOn = java.lang.Integer.valueOf(i3);
        this.EZpvd = java.lang.Integer.valueOf(i4);
        this.sSMYrx = java.lang.Integer.valueOf(i2);
    }
}

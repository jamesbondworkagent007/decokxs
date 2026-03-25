package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.uilab.banner.OKBannerLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public final class wXI extends ConstraintLayout implements wXA {
    public volatile int AYXKKw;
    public java.util.List<java.lang.Object> AhwBna;
    public int AkhnZx;
    public Function1<? super java.lang.Integer, Unit> DbNXlk;
    public Function2<? super ST, java.lang.Object, Unit> EZpvd;
    public int KWHzl;
    public C54949xai OLrzqt;
    public Function1<? super ST, Unit> copydefault;
    public boolean djBIcL;
    public AbstractC52774wXw gEmmrt;
    public java.util.List<C52776wXy> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXI(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.ST, kotlin.Unit>, kotlin.jvm.functions.Function1<o.ST, kotlin.Unit> */
    public final Function1<ST, Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super o.ST, java.lang.Object, kotlin.Unit>, kotlin.jvm.functions.Function2<o.ST, java.lang.Object, kotlin.Unit> */
    public final Function2<ST, java.lang.Object, Unit> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXA
    public void OLrzqt(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertViewCallback(Function2<? super ST, java.lang.Object, Unit> function2) {
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateViewHolderCallback(Function1<? super ST, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnItemClick(Function1<? super java.lang.Integer, Unit> function1) {
        this.DbNXlk = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.wXI.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wXI(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wXI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54949xai c54949xaiEZpvd = C54949xai.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54949xaiEZpvd, "");
        this.OLrzqt = c54949xaiEZpvd;
        this.djBIcL = true;
        this.AhwBna = new java.util.ArrayList();
        this.valueOf = new java.util.ArrayList();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.glVQsU, i, 0);
        setStyle(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.abAflu, 0));
        typedArrayObtainStyledAttributes.recycle();
        OKBannerLayout oKBannerLayout = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKBannerLayout, "");
        KWHzl(oKBannerLayout);
    }

    public final void setStyle(int i) {
        this.AkhnZx = i;
        if (i == 1) {
            setConvertViewId(C52761wXj.Fragment.RJOkX);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            KWHzl(C55298xhM.OLrzqt(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, context));
            return;
        }
        if (i == 2) {
            setConvertViewId(C52761wXj.Fragment.DXXBbs);
            if (this.valueOf.size() > 1) {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                KWHzl(C55298xhM.OLrzqt(CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, context2));
                return;
            } else {
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                KWHzl(C55298xhM.OLrzqt(128, context3));
                return;
            }
        }
        if (i == 3) {
            setConvertViewId(C52761wXj.Fragment.gHZMYf);
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            KWHzl(C55298xhM.OLrzqt(102, context4));
            return;
        }
        setConvertViewId(C52761wXj.Fragment.DTwDnp);
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        KWHzl(C55298xhM.OLrzqt(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, context5));
    }

    public static final class StateListAnimator extends AbstractC52774wXw {
        public StateListAnimator(int i) {
            super(i);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.SS, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd */
        public ST onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            android.widget.TextView textView;
            int iOLrzqt;
            InterfaceC52777wXz interfaceC52777wXzAEQbTJ;
            android.view.View viewEZpvd;
            Intrinsics.checkNotNullParameter(viewGroup, "");
            ST stOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            Intrinsics.checkNotNullExpressionValue(stOnCreateViewHolder, "");
            if (wXI.this.EZpvd() == C52761wXj.Fragment.gHZMYf && (textView = (android.widget.TextView) stOnCreateViewHolder.itemView.findViewById(C52761wXj.FragmentManager.iKEqwx)) != null) {
                wXI wxi = wXI.this;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (!wxi.djBIcL || (interfaceC52777wXzAEQbTJ = wxi.AEQbTJ()) == null || (viewEZpvd = interfaceC52777wXzAEQbTJ.EZpvd()) == null || viewEZpvd.getVisibility() != 0) {
                        iOLrzqt = 0;
                    } else {
                        android.content.Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        iOLrzqt = C55298xhM.OLrzqt(47, context);
                    }
                    layoutParams2.setMarginEnd(iOLrzqt);
                    textView.setLayoutParams(layoutParams2);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
            Function1<ST, Unit> function1KWHzl = wXI.this.KWHzl();
            if (function1KWHzl != null) {
                function1KWHzl.invoke(stOnCreateViewHolder);
            }
            return stOnCreateViewHolder;
        }

        @Override // o.SS
        public void AEQbTJ(ST st, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(st, "");
            Function2<ST, java.lang.Object, Unit> function2OLrzqt = wXI.this.OLrzqt();
            if (function2OLrzqt != null) {
                function2OLrzqt.invoke(st, obj);
            }
        }
    }

    public final void setConvertViewId(int i) {
        this.KWHzl = i;
        this.gEmmrt = new StateListAnimator(i);
        OKBannerLayout oKBannerLayout = this.OLrzqt.copydefault;
        oKBannerLayout.OLrzqt(false);
        Intrinsics.copydefault(oKBannerLayout);
        KWHzl(oKBannerLayout);
        oKBannerLayout.setAdapter(this.gEmmrt);
    }

    public final void setDataList(@NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AhwBna = list;
        AbstractC52774wXw abstractC52774wXw = this.gEmmrt;
        if (abstractC52774wXw != null) {
            abstractC52774wXw.EZpvd(list);
        }
        setCurrentPage(copydefault());
    }

    public final void setItems(@NotNull java.util.List<C52776wXy> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf = list;
        this.EZpvd = new Function2() { // from class: o.wXH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wXI.EZpvd(this.OLrzqt, (ST) obj, obj2);
            }
        };
        AbstractC52774wXw abstractC52774wXw = this.gEmmrt;
        if (abstractC52774wXw != null) {
            abstractC52774wXw.EZpvd(list);
        }
        if (this.AkhnZx == 2) {
            if (list.size() > 1) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                KWHzl(C55298xhM.OLrzqt(CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, context));
            } else {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                KWHzl(C55298xhM.OLrzqt(128, context2));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: kotlin.jvm.functions.Function1<android.widget.ImageView, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final wXI wxi, final ST st, java.lang.Object obj) {
        android.view.View viewOLrzqt;
        int iOLrzqt;
        Intrinsics.checkNotNullParameter(st, "");
        Intrinsics.copydefault(obj, "");
        C52776wXy c52776wXy = (C52776wXy) obj;
        if (wxi.AkhnZx == 2 && (viewOLrzqt = st.OLrzqt(C52761wXj.FragmentManager.AxsJAY)) != null) {
            if (wxi.AYXKKw == 0) {
                android.content.Context context = viewOLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iOLrzqt = C55298xhM.OLrzqt(38, context);
            } else {
                android.content.Context context2 = viewOLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iOLrzqt = C55298xhM.OLrzqt(24, context2);
            }
            viewOLrzqt.setPaddingRelative(viewOLrzqt.getPaddingStart(), iOLrzqt, viewOLrzqt.getPaddingEnd(), viewOLrzqt.getPaddingBottom());
        }
        if (wxi.AkhnZx != 2 && st.OLrzqt(C52761wXj.FragmentManager.iKEqwx) != null) {
            st.copydefault(C52761wXj.FragmentManager.iKEqwx, c52776wXy.AEQbTJ());
        }
        st.copydefault(C52761wXj.FragmentManager.gHZMYf, c52776wXy.copydefault());
        if (wxi.AkhnZx != 3) {
            st.copydefault(C52761wXj.FragmentManager.fJNWhG, c52776wXy.KWHzl());
        }
        st.EZpvd(C52761wXj.FragmentManager.gwTjWJ, c52776wXy.EZpvd());
        Function1<android.widget.ImageView, Unit> function1OLrzqt = c52776wXy.OLrzqt();
        if (function1OLrzqt != 0) {
            android.view.View viewOLrzqt2 = st.OLrzqt(C52761wXj.FragmentManager.gwTjWJ);
            Intrinsics.checkNotNullExpressionValue(viewOLrzqt2, "");
            function1OLrzqt.invoke(viewOLrzqt2);
        }
        st.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.wXJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wXI.copydefault(this.EZpvd, st, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void copydefault(wXI wxi, ST st, android.view.View view) {
        int bindingAdapterPosition;
        Function1<? super java.lang.Integer, Unit> function1 = wxi.DbNXlk;
        if (function1 != null) {
            if (st.getBindingAdapterPosition() == 0) {
                bindingAdapterPosition = wxi.valueOf.size() - 1;
            } else {
                bindingAdapterPosition = (st.getBindingAdapterPosition() - 1) % wxi.valueOf.size();
            }
            function1.invoke(java.lang.Integer.valueOf(bindingAdapterPosition));
        }
    }

    public static /* synthetic */ void updateHeight$default(wXI wxi, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            android.content.Context context = wxi.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C55298xhM.OLrzqt(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, context);
        }
        wxi.KWHzl(i);
    }

    public final void KWHzl(int i) {
        this.OLrzqt.copydefault.getLayoutParams().height = i;
    }

    public final void setCurrentPage(int i) {
        this.OLrzqt.copydefault.setCurrentItem(i);
    }

    public static /* synthetic */ void setCurrentPage$default(wXI wxi, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        wxi.setCurrentPage(i, z);
    }

    public final void setCurrentPage(int i, boolean z) {
        this.OLrzqt.copydefault.setCurrentItem(i, z);
    }

    public final int copydefault() {
        return this.OLrzqt.copydefault.copydefault();
    }

    public final void setAutoPlay(boolean z) {
        this.OLrzqt.copydefault.OLrzqt(z);
    }

    public final void setAutoTurningTime(long j) {
        this.OLrzqt.copydefault.OLrzqt(j);
    }

    public final void setSlider(wXK wxk) {
        this.OLrzqt.copydefault.copydefault(wxk);
    }

    public final InterfaceC52777wXz AEQbTJ() {
        return this.OLrzqt.copydefault.OLrzqt();
    }

    public final void setIndicator(InterfaceC52777wXz interfaceC52777wXz) {
        this.djBIcL = interfaceC52777wXz != null;
        this.OLrzqt.copydefault.copydefault(interfaceC52777wXz);
    }

    public final void setOuterPageChangeListener(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.OLrzqt.copydefault.EZpvd(onPageChangeCallback);
    }

    private final void KWHzl(OKBannerLayout oKBannerLayout) {
        InterfaceC52777wXz wxg;
        int i = this.AkhnZx;
        if (i == 1) {
            android.content.Context context = oKBannerLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            wxg = new wXG(context, null, 0, 6, null);
        } else if (i == 2) {
            android.content.Context context2 = oKBannerLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            wXO wxo = new wXO(context2, null, 0, 6, null);
            wxo.setStyle(1);
            wxo.setOKDSSize(-5);
            wxo.AEQbTJ(this);
            wxg = wxo;
        } else if (i == 3) {
            android.content.Context context3 = oKBannerLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            wxg = new wXB(context3, null, 0, 6, null);
        } else {
            android.content.Context context4 = oKBannerLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            wXO wxo2 = new wXO(context4, null, 0, 6, null);
            wxo2.setStyle(0);
            wxo2.setOKDSSize(-5);
            wxg = wxo2;
        }
        wxg.setCount(oKBannerLayout.KWHzl());
        oKBannerLayout.copydefault(wxg);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wXI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

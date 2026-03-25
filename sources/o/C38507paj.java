package o;

import android.text.TextUtils;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.market.common.biz_spot.Members;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.paj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38507paj extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AhwBna;
    public boolean KWHzl;
    public AbstractC36030oMr djBIcL;
    public final int AEQbTJ = C35964oKf.Application.AuCTelauCTel;
    public final C59534zip OLrzqt = new C59534zip();
    public java.lang.String copydefault = "";

    /* JADX INFO: renamed from: o.paj$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public C38507paj() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37858pDh.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.CoinInfoIntroductionFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.CoinInfoIntroductionFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.CoinInfoIntroductionFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: o.paj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.paj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final C37858pDh KWHzl() {
        return (C37858pDh) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        oMY omy;
        android.widget.TextView textView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC36030oMr abstractC36030oMr = (AbstractC36030oMr) DataBindingUtil.bind(view);
        this.djBIcL = abstractC36030oMr;
        if (abstractC36030oMr != null && (recyclerView2 = abstractC36030oMr.copydefault) != null) {
            recyclerView2.setAdapter(this.OLrzqt);
        }
        AbstractC36030oMr abstractC36030oMr2 = this.djBIcL;
        if (abstractC36030oMr2 != null && (recyclerView = abstractC36030oMr2.copydefault) != null) {
            recyclerView.setLayoutManager(C33047mpA.KWHzl(getContext()));
        }
        this.OLrzqt.register(java.lang.String.class, new C38979pje());
        C59534zip c59534zip = this.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c59534zip.register(C38918piW.class, new C38978pjd(contextRequireContext));
        this.OLrzqt.register(Members.class, new C38909piN());
        KWHzl().fJNWhG().observe(this, new ActionBar(new Function1() { // from class: o.pam
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38507paj.AEQbTJ(this.AEQbTJ, (KlineCoinInfo) obj);
            }
        }));
        AbstractC36030oMr abstractC36030oMr3 = this.djBIcL;
        if (abstractC36030oMr3 == null || (omy = abstractC36030oMr3.KWHzl) == null || (textView = omy.KWHzl) == null) {
            return;
        }
        textView.setOnClickListener(new Application(textView, 1000L, this));
    }

    public static final Unit AEQbTJ(C38507paj c38507paj, KlineCoinInfo klineCoinInfo) {
        if (klineCoinInfo != null) {
            c38507paj.EZpvd(klineCoinInfo, (java.util.List<? extends java.lang.Object>) oLF.EZpvd.KWHzl(klineCoinInfo));
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(boolean z) {
        if (this.KWHzl != z) {
            this.KWHzl = z;
            OLrzqt(z);
        }
    }

    private final void EZpvd(KlineCoinInfo klineCoinInfo, java.util.List<? extends java.lang.Object> list) {
        android.widget.LinearLayout linearLayout;
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.ImageView imageView2;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.TextView textView7;
        android.widget.TextView textView8;
        android.widget.TextView textView9;
        android.widget.LinearLayout linearLayout2;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getIntroduce())) {
            this.copydefault = klineCoinInfo.getIntroduce();
            AbstractC36030oMr abstractC36030oMr = this.djBIcL;
            if (abstractC36030oMr != null && (linearLayout2 = abstractC36030oMr.valueOf) != null) {
                linearLayout2.setVisibility(0);
            }
            AbstractC36030oMr abstractC36030oMr2 = this.djBIcL;
            if (abstractC36030oMr2 != null && (textView9 = abstractC36030oMr2.OLrzqt) != null) {
                textView9.setVisibility(0);
            }
            AbstractC36030oMr abstractC36030oMr3 = this.djBIcL;
            if (abstractC36030oMr3 != null && (textView8 = abstractC36030oMr3.EZpvd) != null) {
                textView8.setVisibility(0);
            }
            AbstractC36030oMr abstractC36030oMr4 = this.djBIcL;
            if (abstractC36030oMr4 != null && (textView7 = abstractC36030oMr4.OLrzqt) != null) {
                textView7.setText(C33069mpW.copydefault(this, C35964oKf.Fragment.UkCIYP, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", klineCoinInfo.getProject()))));
            }
            AbstractC36030oMr abstractC36030oMr5 = this.djBIcL;
            if (abstractC36030oMr5 != null && (textView6 = abstractC36030oMr5.EZpvd) != null) {
                textView6.setText(klineCoinInfo.getIntroduce());
            }
            AbstractC36030oMr abstractC36030oMr6 = this.djBIcL;
            if (abstractC36030oMr6 != null && (textView5 = abstractC36030oMr6.EZpvd) != null) {
                textView5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.pan
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        C38507paj.KWHzl(this.OLrzqt, view, i, i2, i3, i4, i5, i6, i7, i8);
                    }
                });
            }
            if (klineCoinInfo.getIntroduce().length() > 100) {
                AbstractC36030oMr abstractC36030oMr7 = this.djBIcL;
                if (abstractC36030oMr7 != null && (textView4 = abstractC36030oMr7.djBIcL) != null) {
                    textView4.setVisibility(0);
                }
                AbstractC36030oMr abstractC36030oMr8 = this.djBIcL;
                if (abstractC36030oMr8 != null && (imageView2 = abstractC36030oMr8.AEQbTJ) != null) {
                    imageView2.setVisibility(0);
                }
                OLrzqt(false);
                AbstractC36030oMr abstractC36030oMr9 = this.djBIcL;
                if (abstractC36030oMr9 != null && (textView3 = abstractC36030oMr9.djBIcL) != null) {
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: o.pal
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C38507paj.KWHzl(this.AEQbTJ, view);
                        }
                    });
                }
                AbstractC36030oMr abstractC36030oMr10 = this.djBIcL;
                if (abstractC36030oMr10 != null && (textView2 = abstractC36030oMr10.EZpvd) != null) {
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: o.pak
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C38507paj.copydefault(this.AEQbTJ, view);
                        }
                    });
                }
            } else {
                AbstractC36030oMr abstractC36030oMr11 = this.djBIcL;
                if (abstractC36030oMr11 != null && (textView = abstractC36030oMr11.djBIcL) != null) {
                    textView.setVisibility(8);
                }
                AbstractC36030oMr abstractC36030oMr12 = this.djBIcL;
                if (abstractC36030oMr12 != null && (imageView = abstractC36030oMr12.AEQbTJ) != null) {
                    imageView.setVisibility(8);
                }
            }
        } else {
            AbstractC36030oMr abstractC36030oMr13 = this.djBIcL;
            if (abstractC36030oMr13 != null && (linearLayout = abstractC36030oMr13.valueOf) != null) {
                linearLayout.setVisibility(8);
            }
        }
        this.OLrzqt.setItems(list);
        this.OLrzqt.notifyDataSetChanged();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void KWHzl(C38507paj c38507paj, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        AbstractC36030oMr abstractC36030oMr;
        android.widget.ImageView imageView2;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.text.Layout layout;
        android.widget.TextView textView4;
        AbstractC36030oMr abstractC36030oMr2 = c38507paj.djBIcL;
        int lineCount = ((abstractC36030oMr2 == null || (textView4 = abstractC36030oMr2.EZpvd) == null) ? 0 : textView4.getLineCount()) - 1;
        if (lineCount > 0) {
            if (lineCount >= 4 || ((abstractC36030oMr = c38507paj.djBIcL) != null && (textView3 = abstractC36030oMr.EZpvd) != null && (layout = textView3.getLayout()) != null && layout.getEllipsisCount(lineCount) > 0)) {
                AbstractC36030oMr abstractC36030oMr3 = c38507paj.djBIcL;
                if (abstractC36030oMr3 != null && (textView = abstractC36030oMr3.djBIcL) != null) {
                    textView.setVisibility(0);
                }
                AbstractC36030oMr abstractC36030oMr4 = c38507paj.djBIcL;
                if (abstractC36030oMr4 == null || (imageView = abstractC36030oMr4.AEQbTJ) == null) {
                    return;
                }
                imageView.setVisibility(0);
                return;
            }
            AbstractC36030oMr abstractC36030oMr5 = c38507paj.djBIcL;
            if (abstractC36030oMr5 != null && (textView2 = abstractC36030oMr5.djBIcL) != null) {
                textView2.setVisibility(8);
            }
            AbstractC36030oMr abstractC36030oMr6 = c38507paj.djBIcL;
            if (abstractC36030oMr6 == null || (imageView2 = abstractC36030oMr6.AEQbTJ) == null) {
                return;
            }
            imageView2.setVisibility(8);
        }
    }

    public static final void KWHzl(C38507paj c38507paj, android.view.View view) {
        c38507paj.copydefault(!c38507paj.KWHzl);
    }

    public static final void copydefault(C38507paj c38507paj, android.view.View view) {
        c38507paj.copydefault(!c38507paj.KWHzl);
    }

    public final void OLrzqt(boolean z) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        AbstractC36030oMr abstractC36030oMr;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.ImageView imageView2;
        android.widget.TextView textView6;
        if (z) {
            AbstractC36030oMr abstractC36030oMr2 = this.djBIcL;
            if (abstractC36030oMr2 != null && (textView2 = abstractC36030oMr2.EZpvd) != null) {
                textView2.setMaxLines(Integer.MAX_VALUE);
            }
            AbstractC36030oMr abstractC36030oMr3 = this.djBIcL;
            if (abstractC36030oMr3 != null && (textView = abstractC36030oMr3.djBIcL) != null) {
                textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.gtCCJH));
            }
            AbstractC36030oMr abstractC36030oMr4 = this.djBIcL;
            if (abstractC36030oMr4 == null || (imageView = abstractC36030oMr4.AEQbTJ) == null) {
                return;
            }
            imageView.setImageResource(C35964oKf.Activity.DbNXlk);
            return;
        }
        AbstractC36030oMr abstractC36030oMr5 = this.djBIcL;
        if (abstractC36030oMr5 != null && (textView6 = abstractC36030oMr5.djBIcL) != null) {
            textView6.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.flVtFt));
        }
        AbstractC36030oMr abstractC36030oMr6 = this.djBIcL;
        if (abstractC36030oMr6 != null && (imageView2 = abstractC36030oMr6.AEQbTJ) != null) {
            imageView2.setImageResource(C52761wXj.TaskDescription.bindToGooglePlayService);
        }
        AbstractC36030oMr abstractC36030oMr7 = this.djBIcL;
        java.lang.CharSequence text = (abstractC36030oMr7 == null || (textView5 = abstractC36030oMr7.EZpvd) == null) ? null : textView5.getText();
        AbstractC36030oMr abstractC36030oMr8 = this.djBIcL;
        pUU.EZpvd("WMYYYY", "text:" + ((java.lang.Object) text) + " lineCount:" + ((abstractC36030oMr8 == null || (textView4 = abstractC36030oMr8.EZpvd) == null) ? 0 : textView4.getLineCount()));
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault) || (abstractC36030oMr = this.djBIcL) == null || (textView3 = abstractC36030oMr.EZpvd) == null) {
            return;
        }
        textView3.post(new java.lang.Runnable() { // from class: o.par
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38507paj.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(C38507paj c38507paj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.TextView textView7;
        android.widget.TextView textView8;
        android.widget.TextView textView9;
        java.lang.CharSequence text;
        android.widget.TextView textView10;
        android.text.Layout layout;
        android.widget.TextView textView11;
        android.text.Layout layout2;
        android.widget.TextView textView12;
        try {
            AbstractC36030oMr abstractC36030oMr = c38507paj.djBIcL;
            if (abstractC36030oMr != null && (textView3 = abstractC36030oMr.EZpvd) != null && textView3.getLineCount() > 3) {
                try {
                    Result.Application application = Result.Companion;
                    AbstractC36030oMr abstractC36030oMr2 = c38507paj.djBIcL;
                    objM7377constructorimpl = Result.m7377constructorimpl(java.lang.String.valueOf((abstractC36030oMr2 == null || (textView12 = abstractC36030oMr2.EZpvd) == null) ? null : textView12.getText()));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = "";
                }
                java.lang.Object obj = (java.lang.String) objM7377constructorimpl;
                AbstractC36030oMr abstractC36030oMr3 = c38507paj.djBIcL;
                int length = 0;
                int lineStart = (abstractC36030oMr3 == null || (textView11 = abstractC36030oMr3.EZpvd) == null || (layout2 = textView11.getLayout()) == null) ? 0 : layout2.getLineStart(3);
                AbstractC36030oMr abstractC36030oMr4 = c38507paj.djBIcL;
                int lineEnd = (abstractC36030oMr4 == null || (textView10 = abstractC36030oMr4.EZpvd) == null || (layout = textView10.getLayout()) == null) ? 0 : layout.getLineEnd(3);
                if (lineStart < 0 || lineEnd < 0 || lineStart > lineEnd) {
                    return;
                }
                AbstractC36030oMr abstractC36030oMr5 = c38507paj.djBIcL;
                if (abstractC36030oMr5 != null && (textView9 = abstractC36030oMr5.EZpvd) != null && (text = textView9.getText()) != null) {
                    length = text.length();
                }
                if (lineStart < length) {
                    try {
                        Result.Application application3 = Result.Companion;
                        AbstractC36030oMr abstractC36030oMr6 = c38507paj.djBIcL;
                        java.lang.String strSubstring = java.lang.String.valueOf((abstractC36030oMr6 == null || (textView8 = abstractC36030oMr6.EZpvd) == null) ? null : textView8.getText()).substring(lineStart, lineEnd);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        objM7377constructorimpl2 = Result.m7377constructorimpl(strSubstring);
                    } catch (java.lang.Throwable th2) {
                        Result.Application application4 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                    }
                    if (!Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                        obj = objM7377constructorimpl2;
                    }
                    java.lang.String str = (java.lang.String) obj;
                    pUU.EZpvd("WMYYYY", "lineText:" + str);
                    if (Intrinsics.EZpvd((java.lang.Object) "", (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString())) {
                        AbstractC36030oMr abstractC36030oMr7 = c38507paj.djBIcL;
                        if (abstractC36030oMr7 != null && (textView7 = abstractC36030oMr7.EZpvd) != null) {
                            textView7.setMaxLines(3);
                        }
                        AbstractC36030oMr abstractC36030oMr8 = c38507paj.djBIcL;
                        if (abstractC36030oMr8 == null || (textView6 = abstractC36030oMr8.EZpvd) == null) {
                            return;
                        }
                        textView6.setEllipsize(null);
                        return;
                    }
                    AbstractC36030oMr abstractC36030oMr9 = c38507paj.djBIcL;
                    if (abstractC36030oMr9 != null && (textView5 = abstractC36030oMr9.EZpvd) != null) {
                        textView5.setMaxLines(4);
                    }
                    AbstractC36030oMr abstractC36030oMr10 = c38507paj.djBIcL;
                    if (abstractC36030oMr10 == null || (textView4 = abstractC36030oMr10.EZpvd) == null) {
                        return;
                    }
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    return;
                }
                return;
            }
            AbstractC36030oMr abstractC36030oMr11 = c38507paj.djBIcL;
            if (abstractC36030oMr11 != null && (textView2 = abstractC36030oMr11.EZpvd) != null) {
                textView2.setMaxLines(4);
            }
            AbstractC36030oMr abstractC36030oMr12 = c38507paj.djBIcL;
            if (abstractC36030oMr12 == null || (textView = abstractC36030oMr12.EZpvd) == null) {
                return;
            }
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o.paj$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C38507paj OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C38507paj c38507paj) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c38507paj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C39369pqx.Companion.EZpvd().show(this.OLrzqt.getChildFragmentManager(), C39369pqx.class.getSimpleName());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        oLF.EZpvd.AEQbTJ();
    }
}

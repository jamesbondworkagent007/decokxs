package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.market.common.biz_spot.Members;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oZZ extends AbstractC32996moC {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public AbstractC36028oMp djBIcL;
    public final InterfaceC56387yDm valueOf;
    public final int gEmmrt = C35964oKf.Application.fIwbmz;
    public final C59534zip OLrzqt = new C59534zip();
    public final C59534zip KWHzl = new C59534zip();
    public java.lang.String AYXKKw = "";
    public java.lang.String copydefault = "";

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public oZZ() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37858pDh.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.CoinInfoInfoFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.CoinInfoInfoFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.CoinInfoInfoFragment$special$$inlined$activityViewModels$default$3
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

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oZZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull android.content.Context context, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            try {
                context.startActivity(intent);
            } catch (java.lang.Exception e) {
                android.util.Log.getStackTraceString(e);
            }
        }
    }

    public final void EZpvd(boolean z) {
        if (this.AEQbTJ != z) {
            this.AEQbTJ = z;
            copydefault(z);
        }
    }

    private final C37858pDh copydefault() {
        return (C37858pDh) this.valueOf.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        Intrinsics.checkNotNullParameter(view, "");
        this.djBIcL = (AbstractC36028oMp) DataBindingUtil.bind(view);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("symbol") : null;
        Intrinsics.copydefault((java.lang.Object) string);
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Intrinsics.checkNotNullExpressionValue(string.toLowerCase(locale), "");
        AbstractC36028oMp abstractC36028oMp = this.djBIcL;
        if (abstractC36028oMp != null && (recyclerView5 = abstractC36028oMp.AEQbTJ) != null) {
            recyclerView5.setAdapter(this.OLrzqt);
        }
        AbstractC36028oMp abstractC36028oMp2 = this.djBIcL;
        if (abstractC36028oMp2 != null && (recyclerView4 = abstractC36028oMp2.AEQbTJ) != null) {
            recyclerView4.setLayoutManager(C33047mpA.copydefault(getContext(), 2));
        }
        AbstractC36028oMp abstractC36028oMp3 = this.djBIcL;
        if (abstractC36028oMp3 != null && (recyclerView3 = abstractC36028oMp3.AEQbTJ) != null) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerView3.addItemDecoration(new C31703mAu(C33052mpF.EZpvd(16.0f, context), 0));
        }
        this.OLrzqt.register(C38569pbs.class, new C38571pbu());
        AbstractC36028oMp abstractC36028oMp4 = this.djBIcL;
        if (abstractC36028oMp4 != null && (recyclerView2 = abstractC36028oMp4.EZpvd) != null) {
            recyclerView2.setAdapter(this.KWHzl);
        }
        AbstractC36028oMp abstractC36028oMp5 = this.djBIcL;
        if (abstractC36028oMp5 != null && (recyclerView = abstractC36028oMp5.EZpvd) != null) {
            RecyclerView.LayoutManager layoutManagerKWHzl = C33047mpA.KWHzl(getContext());
            layoutManagerKWHzl.setItemPrefetchEnabled(true);
            if (layoutManagerKWHzl instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManagerKWHzl).setInitialPrefetchItemCount(5);
            }
            recyclerView.setLayoutManager(layoutManagerKWHzl);
        }
        this.KWHzl.register(java.lang.String.class, new C38979pje());
        C59534zip c59534zip = this.KWHzl;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c59534zip.register(C38918piW.class, new C38978pjd(contextRequireContext));
        this.KWHzl.register(Members.class, new C38909piN());
        copydefault().ejfBZ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.paa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZZ.KWHzl(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit KWHzl(final oZZ ozz, kotlin.Pair pair) {
        oLF olf = oLF.EZpvd;
        olf.EZpvd(ozz, (java.lang.String) pair.getFirst(), (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, new Function1() { // from class: o.paf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZZ.EZpvd(this.EZpvd, (java.util.List) obj);
            }
        });
        olf.AEQbTJ(ozz, (java.lang.String) pair.getFirst(), new Function2() { // from class: o.pae
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return oZZ.KWHzl(this.EZpvd, (KlineCoinInfo) obj, (java.util.List) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(oZZ ozz, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (ozz.isAdded() && ozz.getActivity() != null) {
            ozz.EZpvd((java.util.List<? extends java.lang.Object>) list);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(oZZ ozz, KlineCoinInfo klineCoinInfo, java.util.List list) {
        Intrinsics.checkNotNullParameter(klineCoinInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (ozz.isAdded() && ozz.getActivity() != null) {
            ozz.KWHzl(klineCoinInfo, (java.util.List<? extends java.lang.Object>) list);
            ozz.copydefault().fJNWhG().postValue(klineCoinInfo);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.List<? extends java.lang.Object> list) {
        this.OLrzqt.setItems(list);
        this.OLrzqt.notifyDataSetChanged();
    }

    public final void KWHzl(KlineCoinInfo klineCoinInfo, java.util.List<? extends java.lang.Object> list) {
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
        if (C33129mqd.OLrzqt((java.lang.CharSequence) klineCoinInfo.getIntroduce())) {
            this.AYXKKw = klineCoinInfo.getIntroduce();
            this.copydefault = klineCoinInfo.getProject();
            AbstractC36028oMp abstractC36028oMp = this.djBIcL;
            if (abstractC36028oMp != null && (textView9 = abstractC36028oMp.OLrzqt) != null) {
                textView9.setVisibility(0);
            }
            AbstractC36028oMp abstractC36028oMp2 = this.djBIcL;
            if (abstractC36028oMp2 != null && (textView8 = abstractC36028oMp2.KWHzl) != null) {
                textView8.setText(this.AYXKKw);
            }
            AbstractC36028oMp abstractC36028oMp3 = this.djBIcL;
            if (abstractC36028oMp3 != null && (textView7 = abstractC36028oMp3.KWHzl) != null) {
                textView7.setVisibility(0);
            }
            AbstractC36028oMp abstractC36028oMp4 = this.djBIcL;
            if (abstractC36028oMp4 != null && (textView6 = abstractC36028oMp4.KWHzl) != null) {
                textView6.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.pag
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        oZZ.OLrzqt(this.copydefault, view, i, i2, i3, i4, i5, i6, i7, i8);
                    }
                });
            }
            AbstractC36028oMp abstractC36028oMp5 = this.djBIcL;
            if (abstractC36028oMp5 != null && (textView5 = abstractC36028oMp5.OLrzqt) != null) {
                textView5.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.accept) + " " + klineCoinInfo.getProject());
            }
            if (klineCoinInfo.getIntroduce().length() > 100) {
                AbstractC36028oMp abstractC36028oMp6 = this.djBIcL;
                if (abstractC36028oMp6 != null && (textView4 = abstractC36028oMp6.AhwBna) != null) {
                    textView4.setVisibility(0);
                }
                AbstractC36028oMp abstractC36028oMp7 = this.djBIcL;
                if (abstractC36028oMp7 != null && (imageView2 = abstractC36028oMp7.copydefault) != null) {
                    imageView2.setVisibility(0);
                }
                AbstractC36028oMp abstractC36028oMp8 = this.djBIcL;
                if (abstractC36028oMp8 != null && (textView3 = abstractC36028oMp8.AhwBna) != null) {
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: o.pai
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            oZZ.KWHzl(this.AEQbTJ, view);
                        }
                    });
                }
                AbstractC36028oMp abstractC36028oMp9 = this.djBIcL;
                if (abstractC36028oMp9 != null && (textView2 = abstractC36028oMp9.KWHzl) != null) {
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: o.pah
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            oZZ.AEQbTJ(this.copydefault, view);
                        }
                    });
                }
            } else {
                AbstractC36028oMp abstractC36028oMp10 = this.djBIcL;
                if (abstractC36028oMp10 != null && (textView = abstractC36028oMp10.AhwBna) != null) {
                    textView.setVisibility(8);
                }
                AbstractC36028oMp abstractC36028oMp11 = this.djBIcL;
                if (abstractC36028oMp11 != null && (imageView = abstractC36028oMp11.copydefault) != null) {
                    imageView.setVisibility(8);
                }
            }
        }
        this.KWHzl.setItems(list);
        this.KWHzl.notifyDataSetChanged();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void OLrzqt(oZZ ozz, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        AbstractC36028oMp abstractC36028oMp;
        android.widget.ImageView imageView2;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.text.Layout layout;
        android.widget.TextView textView4;
        AbstractC36028oMp abstractC36028oMp2 = ozz.djBIcL;
        int lineCount = ((abstractC36028oMp2 == null || (textView4 = abstractC36028oMp2.KWHzl) == null) ? 0 : textView4.getLineCount()) - 1;
        if (lineCount >= 0) {
            if (lineCount >= 4 || ((abstractC36028oMp = ozz.djBIcL) != null && (textView3 = abstractC36028oMp.KWHzl) != null && (layout = textView3.getLayout()) != null && layout.getEllipsisCount(lineCount) > 0)) {
                AbstractC36028oMp abstractC36028oMp3 = ozz.djBIcL;
                if (abstractC36028oMp3 != null && (textView = abstractC36028oMp3.AhwBna) != null) {
                    textView.setVisibility(0);
                }
                AbstractC36028oMp abstractC36028oMp4 = ozz.djBIcL;
                if (abstractC36028oMp4 == null || (imageView = abstractC36028oMp4.copydefault) == null) {
                    return;
                }
                imageView.setVisibility(0);
                return;
            }
            AbstractC36028oMp abstractC36028oMp5 = ozz.djBIcL;
            if (abstractC36028oMp5 != null && (textView2 = abstractC36028oMp5.AhwBna) != null) {
                textView2.setVisibility(8);
            }
            AbstractC36028oMp abstractC36028oMp6 = ozz.djBIcL;
            if (abstractC36028oMp6 == null || (imageView2 = abstractC36028oMp6.copydefault) == null) {
                return;
            }
            imageView2.setVisibility(8);
        }
    }

    public static final void KWHzl(oZZ ozz, android.view.View view) {
        ozz.EZpvd(!ozz.AEQbTJ);
    }

    public static final void AEQbTJ(oZZ ozz, android.view.View view) {
        ozz.EZpvd(!ozz.AEQbTJ);
    }

    public final void copydefault(boolean z) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.ImageView imageView2;
        android.widget.TextView textView5;
        if (z) {
            AbstractC36028oMp abstractC36028oMp = this.djBIcL;
            if (abstractC36028oMp != null && (textView2 = abstractC36028oMp.KWHzl) != null) {
                textView2.setMaxLines(Integer.MAX_VALUE);
            }
            AbstractC36028oMp abstractC36028oMp2 = this.djBIcL;
            if (abstractC36028oMp2 != null && (textView = abstractC36028oMp2.AhwBna) != null) {
                textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.gtCCJH));
            }
            AbstractC36028oMp abstractC36028oMp3 = this.djBIcL;
            if (abstractC36028oMp3 == null || (imageView = abstractC36028oMp3.copydefault) == null) {
                return;
            }
            imageView.setImageResource(C35964oKf.Activity.DbNXlk);
            return;
        }
        AbstractC36028oMp abstractC36028oMp4 = this.djBIcL;
        if (abstractC36028oMp4 != null && (textView5 = abstractC36028oMp4.AhwBna) != null) {
            textView5.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.flVtFt));
        }
        AbstractC36028oMp abstractC36028oMp5 = this.djBIcL;
        if (abstractC36028oMp5 != null && (imageView2 = abstractC36028oMp5.copydefault) != null) {
            imageView2.setImageResource(C52761wXj.TaskDescription.bindToGooglePlayService);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AYXKKw)) {
            AbstractC36028oMp abstractC36028oMp6 = this.djBIcL;
            if (abstractC36028oMp6 != null && (textView4 = abstractC36028oMp6.OLrzqt) != null) {
                textView4.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.accept) + " " + this.copydefault);
            }
            AbstractC36028oMp abstractC36028oMp7 = this.djBIcL;
            if (abstractC36028oMp7 == null || (textView3 = abstractC36028oMp7.KWHzl) == null) {
                return;
            }
            textView3.setMaxLines(4);
        }
    }

    public final android.view.View EZpvd() {
        android.widget.TextView textView;
        AbstractC36028oMp abstractC36028oMp = this.djBIcL;
        if (abstractC36028oMp != null && (textView = abstractC36028oMp.KWHzl) != null) {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        AbstractC36028oMp abstractC36028oMp2 = this.djBIcL;
        android.widget.LinearLayout linearLayout = abstractC36028oMp2 != null ? abstractC36028oMp2.djBIcL : null;
        Intrinsics.copydefault(linearLayout);
        return linearLayout;
    }

    public final android.view.View OLrzqt() {
        AbstractC36028oMp abstractC36028oMp = this.djBIcL;
        if (abstractC36028oMp != null) {
            return abstractC36028oMp.gEmmrt;
        }
        return null;
    }

    public final void AEQbTJ() {
        EZpvd(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        oLF.EZpvd.AEQbTJ();
    }
}

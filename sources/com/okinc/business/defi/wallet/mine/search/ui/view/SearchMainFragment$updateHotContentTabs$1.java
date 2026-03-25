package com.okinc.business.defi.wallet.mine.search.ui.view;

import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$updateHotContentTabs$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.adapter.HotContentPage;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C13754dXa;
import o.C15934eaS;
import o.C16686eoc;
import o.C19003ftA;
import o.C19128fvT;
import o.C55254xgV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchMainFragment$updateHotContentTabs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hasDapps;
    final /* synthetic */ boolean $hasTokens;
    int label;
    final /* synthetic */ C19003ftA this$0;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HotContentPage.values().length];
            try {
                iArr[HotContentPage.TOKENS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HotContentPage.DAPPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMainFragment$updateHotContentTabs$1(boolean z, boolean z2, C19003ftA c19003ftA, Continuation<? super SearchMainFragment$updateHotContentTabs$1> continuation) {
        super(2, continuation);
        this.$hasDapps = z;
        this.$hasTokens = z2;
        this.this$0 = c19003ftA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchMainFragment$updateHotContentTabs$1(this.$hasDapps, this.$hasTokens, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchMainFragment$updateHotContentTabs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        TextView textView;
        C55254xgV c55254xgV;
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        TextView textView2;
        String string;
        TextView textView3;
        C55254xgV c55254xgV2;
        ViewPager2 viewPager23;
        C55254xgV c55254xgV3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        TabLayoutMediator tabLayoutMediator = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(true);
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
        boolean z = (abstractC12782ctV == null || !C15934eaS.OLrzqt(abstractC12782ctV)) ? this.$hasDapps : false;
        ArrayList arrayList = new ArrayList();
        if (this.$hasTokens) {
            arrayList.add(HotContentPage.TOKENS);
        }
        if (z) {
            arrayList.add(HotContentPage.DAPPS);
        }
        if (arrayList.isEmpty()) {
            C16686eoc c16686eoc = this.this$0.KWHzl;
            if (c16686eoc != null && (c55254xgV3 = c16686eoc.OLrzqt) != null) {
                c55254xgV3.setVisibility(8);
            }
            C16686eoc c16686eoc2 = this.this$0.KWHzl;
            if (c16686eoc2 != null && (viewPager23 = c16686eoc2.KWHzl) != null) {
                viewPager23.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
        TabLayoutMediator tabLayoutMediator2 = this.this$0.valueOf;
        if (tabLayoutMediator2 != null) {
            tabLayoutMediator2.detach();
        }
        this.this$0.valueOf = null;
        C16686eoc c16686eoc3 = this.this$0.KWHzl;
        if (c16686eoc3 != null && (c55254xgV2 = c16686eoc3.OLrzqt) != null) {
            boolean z2 = this.$hasTokens;
            c55254xgV2.copydefault().removeAllTabs();
            if (z2) {
                c55254xgV2.EZpvd(c55254xgV2.gEmmrt());
            }
            if (z) {
                c55254xgV2.EZpvd(c55254xgV2.gEmmrt());
            }
            c55254xgV2.setVisibility(arrayList.size() > 1 ? 0 : 8);
        }
        if (arrayList.size() == 1) {
            C16686eoc c16686eoc4 = this.this$0.KWHzl;
            if (c16686eoc4 != null && (textView3 = c16686eoc4.AkhnZx) != null) {
                textView3.setVisibility(0);
            }
            C16686eoc c16686eoc5 = this.this$0.KWHzl;
            if (c16686eoc5 != null && (textView2 = c16686eoc5.AkhnZx) != null) {
                if (this.$hasTokens) {
                    string = this.this$0.getString(C13754dXa.FragmentManager.addOnMenuVisibilityListener);
                } else {
                    string = z ? this.this$0.getString(C13754dXa.FragmentManager.Rstyleable) : "";
                }
                textView2.setText(string);
            }
        } else {
            C16686eoc c16686eoc6 = this.this$0.KWHzl;
            if (c16686eoc6 != null && (textView = c16686eoc6.AkhnZx) != null) {
                textView.setVisibility(8);
            }
        }
        C16686eoc c16686eoc7 = this.this$0.KWHzl;
        if (c16686eoc7 != null && (viewPager22 = c16686eoc7.KWHzl) != null) {
            viewPager22.setVisibility(0);
        }
        C19128fvT c19128fvT = this.this$0.AEQbTJ;
        if (c19128fvT == null) {
            Intrinsics.gEmmrt("");
            c19128fvT = null;
        }
        c19128fvT.KWHzl(arrayList);
        C19003ftA c19003ftA = this.this$0;
        C16686eoc c16686eoc8 = c19003ftA.KWHzl;
        if (c16686eoc8 != null && (c55254xgV = c16686eoc8.OLrzqt) != null) {
            final C19003ftA c19003ftA2 = this.this$0;
            C16686eoc c16686eoc9 = c19003ftA2.KWHzl;
            if (c16686eoc9 != null && (viewPager2 = c16686eoc9.KWHzl) != null) {
                TabLayoutMediator tabLayoutMediator3 = new TabLayoutMediator(c55254xgV.copydefault(), viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.ftG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                    public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                        SearchMainFragment$updateHotContentTabs$1.invokeSuspend$lambda$5$lambda$4$lambda$2(c19003ftA2, tab, i2);
                    }
                });
                tabLayoutMediator3.attach();
                tabLayoutMediator = tabLayoutMediator3;
            }
        }
        c19003ftA.valueOf = tabLayoutMediator;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5$lambda$4$lambda$2(C19003ftA c19003ftA, TabLayout.Tab tab, int i) {
        C19128fvT c19128fvT = c19003ftA.AEQbTJ;
        String string = "";
        if (c19128fvT == null) {
            Intrinsics.gEmmrt("");
            c19128fvT = null;
        }
        HotContentPage hotContentPageAEQbTJ = c19128fvT.AEQbTJ(i);
        int i2 = hotContentPageAEQbTJ == null ? -1 : Application.AEQbTJ[hotContentPageAEQbTJ.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                string = c19003ftA.getString(C13754dXa.FragmentManager.addOnMenuVisibilityListener);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                string = c19003ftA.getString(C13754dXa.FragmentManager.Rstyleable);
            }
        }
        tab.setText(string);
    }
}

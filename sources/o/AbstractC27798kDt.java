package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.home.common.HomeBaseQuoteFragment$changeAnimState$1$1;
import com.okinc.business.market.home.common.HomeBaseQuoteFragment$requestData$1;
import com.okinc.core.widget.SortTextView;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.tradeapi.bean.SourceResp;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kDt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC27798kDt extends AbstractC27793kDo {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final boolean AhwBna;
    public Job DbNXlk;
    public C27803kDy fJNWhG;
    public Job fetchVPNInfo;
    public C42951rgB hDKMBd;
    public boolean values;
    public boolean isConnected = true;
    public final C54588xNy getFieldNames = new C54588xNy();
    public final int AkhnZx = qZH.ActionBar.gEmmrt;
    public final C59534zip fARcdN = new C59534zip();
    public final java.util.ArrayList<CoinQuote> iwGUEr = new java.util.ArrayList<>();
    public boolean ejfBZ = true;
    public java.lang.String getNewProxyInstance = "";
    public final MutableLiveData<java.lang.String> fIwbmz = C42955rgF.copydefault.copydefault();
    public final Observer<SourceResp<InterfaceC54581xNr>> uzCIH = new Observer() { // from class: o.kDA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC27798kDt.AEQbTJ((SourceResp) obj);
        }
    };
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.kDz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC27798kDt.OLrzqt(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.kDt$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortTextView.SortType.values().length];
            try {
                iArr[SortTextView.SortType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SortTextView.SortType.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SortTextView.SortType.DOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AEQbTJ(SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C54588xNy AEQbTJ() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Boolean[] AuCTel() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return new java.lang.Boolean[]{bool, bool, bool};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27803kDy DbNXlk() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull InterfaceC54581xNr interfaceC54581xNr) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59534zip isConnected() {
        return this.fARcdN;
    }

    /* JADX INFO: renamed from: o.kDt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kDt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC27793kDo, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.fJNWhG = C27803kDy.Companion.EZpvd(view);
        if (copydefault()) {
            return;
        }
        EZpvd(view);
    }

    public final void EZpvd(@NotNull android.view.View view) {
        android.view.ViewStub viewStubCopydefault;
        Intrinsics.checkNotNullParameter(view, "");
        C27803kDy c27803kDy = this.fJNWhG;
        if (((c27803kDy == null || (viewStubCopydefault = c27803kDy.copydefault()) == null) ? null : viewStubCopydefault.getParent()) != null) {
            ((android.view.ViewStub) view.findViewById(qZH.StateListAnimator.OUcgGI)).inflate();
            C42951rgB c42951rgB = (C42951rgB) view.findViewById(qZH.StateListAnimator.dGrqPl);
            this.hDKMBd = c42951rgB;
            if (c42951rgB != null) {
                c42951rgB.setCallback(AuCTel(), values(), new Function2() { // from class: o.kDw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return AbstractC27798kDt.EZpvd(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2);
                    }
                });
            }
            C42951rgB c42951rgB2 = this.hDKMBd;
            if (c42951rgB2 != null) {
                c42951rgB2.setVolumeSortChange(new yHT() { // from class: o.kDx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHT
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return AbstractC27798kDt.AEQbTJ(this.EZpvd, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2, ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                    }
                });
            }
        }
    }

    public static final Unit EZpvd(AbstractC27798kDt abstractC27798kDt, int i, SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        java.lang.String strKWHzl = abstractC27798kDt.KWHzl(i, sortType);
        abstractC27798kDt.getNewProxyInstance = strKWHzl;
        abstractC27798kDt.AEQbTJ(strKWHzl);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC27798kDt abstractC27798kDt, int i, SortTextView.SortType sortType, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sortType, "");
        if (i2 == 1) {
            abstractC27798kDt.fIwbmz.setValue("Volume");
        } else {
            abstractC27798kDt.fIwbmz.setValue("Turnover");
        }
        if (i3 == 0) {
            abstractC27798kDt.getNewProxyInstance = "";
        } else if (i3 != 1) {
            if (i2 == 1) {
                abstractC27798kDt.getNewProxyInstance = "volume_descending_sort";
            } else {
                abstractC27798kDt.getNewProxyInstance = "turnover_descending_sort";
            }
        } else if (i2 == 1) {
            abstractC27798kDt.getNewProxyInstance = "volume_ascending_sort";
        } else {
            abstractC27798kDt.getNewProxyInstance = "turnover_ascending_sort";
        }
        abstractC27798kDt.AEQbTJ(abstractC27798kDt.getNewProxyInstance);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        rVN.copydefault(this);
        if (valueOf()) {
            OLrzqt(C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null));
            OLrzqt(false);
        }
        onInvisible();
        fJNWhG();
        if (!this.values) {
            this.values = true;
            copydefault(true);
        }
        ejfBZ();
    }

    public final void copydefault(boolean z) {
        android.widget.FrameLayout frameLayoutOLrzqt;
        if (this.ejfBZ) {
            Job job = this.fetchVPNInfo;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            C27803kDy c27803kDy = this.fJNWhG;
            if (c27803kDy == null || (frameLayoutOLrzqt = c27803kDy.OLrzqt()) == null) {
                return;
            }
            if (z) {
                this.fetchVPNInfo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeBaseQuoteFragment$changeAnimState$1$1(frameLayoutOLrzqt, null), 3, null);
                return;
            }
            this.ejfBZ = false;
            pXA.OLrzqt(frameLayoutOLrzqt);
            pUU.KWHzl(getTAG(), "remove loading");
        }
    }

    public final void fetchVPNInfo() {
        android.view.View view;
        if (copydefault() && (view = getView()) != null) {
            EZpvd(view);
        }
        AEQbTJ(true);
        copydefault(false);
        EZpvd(false);
    }

    public final void fARcdN() {
        if (getContext() == null) {
            return;
        }
        AEQbTJ(false);
        copydefault(false);
        if (this.fARcdN.getItemCount() == 0) {
            EZpvd(true);
        }
    }

    public void AEQbTJ(boolean z) {
        if (this.isConnected) {
            this.isConnected = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
        }
        rVN.reportFullyDrawn$default(this, z, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final C55173xeu AkhnZx() {
        return (C55173xeu) this.AuCTel.getValue();
    }

    public static final C55173xeu OLrzqt(AbstractC27798kDt abstractC27798kDt) {
        android.content.Context contextRequireContext = abstractC27798kDt.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C55173xeu(contextRequireContext, null, 0, 6, null);
    }

    private final void EZpvd(boolean z) {
        C27803kDy c27803kDy;
        android.widget.FrameLayout frameLayoutKWHzl;
        android.widget.FrameLayout frameLayoutKWHzl2;
        android.widget.FrameLayout frameLayoutKWHzl3;
        if (getContext() == null) {
            return;
        }
        C27803kDy c27803kDy2 = this.fJNWhG;
        if (c27803kDy2 != null && (frameLayoutKWHzl3 = c27803kDy2.KWHzl()) != null) {
            frameLayoutKWHzl3.setVisibility(z ? 0 : 8);
        }
        if (z) {
            C55173xeu c55173xeuAkhnZx = AkhnZx();
            java.lang.String string = getString(qZH.PendingIntent.DsL);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeuAkhnZx.setTitle(string);
            AkhnZx().setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj));
            C55173xeu c55173xeuAkhnZx2 = AkhnZx();
            java.lang.String string2 = getString(qZH.PendingIntent.fetchVPNInfo);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeuAkhnZx2.setRetry(string2);
            AkhnZx().setRetryClickListener(new View.OnClickListener() { // from class: o.kDu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC27798kDt.EZpvd(this.EZpvd, view);
                }
            });
            AkhnZx().setEmptyTypeImage(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            layoutParams.topMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
            layoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
            AkhnZx().setLayoutParams(layoutParams);
            if (AkhnZx().getParent() != null) {
                android.view.ViewParent parent = AkhnZx().getParent();
                Intrinsics.copydefault(parent, "");
                ((android.view.ViewGroup) parent).removeView(AkhnZx());
            }
            C27803kDy c27803kDy3 = this.fJNWhG;
            if (c27803kDy3 == null || (frameLayoutKWHzl2 = c27803kDy3.KWHzl()) == null) {
                return;
            }
            frameLayoutKWHzl2.addView(AkhnZx());
            return;
        }
        C27803kDy c27803kDy4 = this.fJNWhG;
        if (c27803kDy4 == null || c27803kDy4.KWHzl() == null || (c27803kDy = this.fJNWhG) == null || (frameLayoutKWHzl = c27803kDy.KWHzl()) == null) {
            return;
        }
        frameLayoutKWHzl.removeAllViews();
    }

    public static final void EZpvd(AbstractC27798kDt abstractC27798kDt, android.view.View view) {
        android.widget.FrameLayout frameLayoutKWHzl;
        C27803kDy c27803kDy = abstractC27798kDt.fJNWhG;
        if (c27803kDy != null && (frameLayoutKWHzl = c27803kDy.KWHzl()) != null) {
            frameLayoutKWHzl.setVisibility(8);
        }
        abstractC27798kDt.ejfBZ = true;
        abstractC27798kDt.copydefault(true);
        abstractC27798kDt.onVisible();
    }

    public void ejfBZ() {
        this.DbNXlk = LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new HomeBaseQuoteFragment$requestData$1(this, null));
    }

    public final void fJNWhG() {
        C42951rgB c42951rgB;
        android.view.View view = getView();
        if (view == null || (c42951rgB = (C42951rgB) view.findViewById(qZH.StateListAnimator.dGrqPl)) == null) {
            return;
        }
        c42951rgB.setTexts(values());
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        Job job = this.DbNXlk;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (gEmmrt()) {
            return;
        }
        pUU.KWHzl(getTAG(), "cancel report grafana");
        OLrzqt("");
    }

    public java.lang.String[] values() {
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        return new java.lang.String[]{C33070mpX.AYXKKw(qZH.PendingIntent.zLjUOn), C33070mpX.AYXKKw(qZH.PendingIntent.gdmIOq), C33070mpX.AYXKKw((interfaceC46557tYt == null || interfaceC46557tYt.EZpvd() != 0) ? qZH.PendingIntent.zsXlph : qZH.PendingIntent.ihnvzI)};
    }

    public final java.lang.String KWHzl(int i, SortTextView.SortType sortType) {
        int i2 = Application.AEQbTJ[sortType.ordinal()];
        if (i2 == 1) {
            return "";
        }
        if (i2 == 2) {
            return i != 0 ? i != 1 ? "applies_ascending_sort" : "price_ascending_sort" : "name_ascending_sort";
        }
        if (i2 == 3) {
            return i != 0 ? i != 1 ? "applies_descending_sort" : "price_descending_sort" : "name_descending_sort";
        }
        throw new NoWhenBranchMatchedException();
    }
}

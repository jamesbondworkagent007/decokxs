package o;

import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import com.okinc.buysell.ui.result.view.BSCConvertDetailBannerItem;
import com.okinc.buysell.ui.result.view.BannerClickCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class lSU implements InterfaceC32973mng<BSCConvertDetailBannerItem> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public AbstractC31615lxq AEQbTJ;
    public android.view.View EZpvd;
    public final Function1<BannerClickCallback, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.result.view.BannerClickCallback, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public lSU(@NotNull Function1<? super BannerClickCallback, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    @Override // o.InterfaceC32973mng
    public android.view.View OLrzqt(android.content.Context context) {
        android.view.View viewInflate = android.view.View.inflate(context, C31351lsQ.ActionBar.OJuSTm, null);
        this.EZpvd = viewInflate;
        if (viewInflate == null) {
            Intrinsics.gEmmrt("");
            viewInflate = null;
        }
        this.AEQbTJ = (AbstractC31615lxq) DataBindingUtil.bind(viewInflate);
        android.view.View view = this.EZpvd;
        if (view != null) {
            return view;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;ILjava/lang/Object;)V */
    @Override // o.InterfaceC32973mng
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(android.content.Context context, int i, final BSCConvertDetailBannerItem bSCConvertDetailBannerItem) {
        AbstractC31615lxq abstractC31615lxq;
        if (context == null || bSCConvertDetailBannerItem == null || (abstractC31615lxq = this.AEQbTJ) == null) {
            return;
        }
        Glide.AEQbTJ(context).EZpvd(bSCConvertDetailBannerItem.getCoinUrl()).EZpvd(abstractC31615lxq.gEmmrt);
        abstractC31615lxq.valueOf.setText(bSCConvertDetailBannerItem.getProductName());
        abstractC31615lxq.copydefault.setText(bSCConvertDetailBannerItem.getCoinName());
        abstractC31615lxq.AYXKKw.setText(bSCConvertDetailBannerItem.getPercentage());
        abstractC31615lxq.djBIcL.setText(bSCConvertDetailBannerItem.getTagTitle());
        abstractC31615lxq.AhwBna.setText(bSCConvertDetailBannerItem.getDescription());
        android.widget.TextView textView = abstractC31615lxq.AYXKKw;
        java.lang.String str = bSCConvertDetailBannerItem.getPercentage() + " ";
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.String percentage = bSCConvertDetailBannerItem.getPercentage();
        if (percentage == null) {
            percentage = "";
        }
        strArr[0] = percentage;
        textView.setText(C33574myy.setupSpanStyles$default(str, strArr, 0, null, false, new Function1() { // from class: o.lSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lSU.AEQbTJ((java.util.List) obj);
            }
        }, 14, null));
        C8003auW.copydefault(abstractC31615lxq.AEQbTJ).throttleFirst(2L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.lST
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                lSU.KWHzl(this.KWHzl, bSCConvertDetailBannerItem, obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new lSN(C33070mpX.copydefault(C52761wXj.Activity.iRxXKY), C33070mpX.copydefault(C52761wXj.Activity.DeEinT), 0.0f, 4, null));
        return Unit.INSTANCE;
    }

    public static final void KWHzl(lSU lsu, BSCConvertDetailBannerItem bSCConvertDetailBannerItem, java.lang.Object obj) {
        Function1<BannerClickCallback, Unit> function1 = lsu.KWHzl;
        java.lang.String convertBannerType = bSCConvertDetailBannerItem.getConvertBannerType();
        if (convertBannerType == null) {
            convertBannerType = "convert_banner_type_earn";
        }
        function1.invoke(new BannerClickCallback(convertBannerType, bSCConvertDetailBannerItem.getCurrencyId(), bSCConvertDetailBannerItem.getCoinName()));
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lSU.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

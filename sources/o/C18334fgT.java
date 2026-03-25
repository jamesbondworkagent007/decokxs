package o;

import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.ContextCompat;
import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean;
import com.okinc.business.defi.biz.drivers.bean.ICloudNetworkListBean;
import com.okinc.business.defi.wallet.icloud.binders.CloudBackupContentBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18334fgT extends AbstractC14584doH<C18336fgV, C16739epc> {
    public final int AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    public C18334fgT(int i) {
        super(CloudBackupContentBinder$1.INSTANCE);
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16739epc c16739epc, @NotNull C18336fgV c18336fgV) {
        java.lang.String walletName;
        Intrinsics.checkNotNullParameter(c16739epc, "");
        Intrinsics.checkNotNullParameter(c18336fgV, "");
        OKRegularCell oKRegularCell = c16739epc.AEQbTJ;
        HDWalletBackupTypeBean backupTypeBean = c18336fgV.copydefault().getBackupTypeBean();
        if (backupTypeBean == null || (walletName = backupTypeBean.getWalletName()) == null) {
            walletName = "";
        }
        oKRegularCell.setTitle(walletName);
        oKRegularCell.setDescription(C33069mpW.copydefault(C13754dXa.FragmentManager.enforcement, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(c18336fgV.copydefault().getCreateTime())), null, 1, null)))));
        if (!c18336fgV.KWHzl()) {
            android.content.Context context = oKRegularCell.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            KWHzl(context, c16739epc);
        }
        oKRegularCell.setOnClickListener(new TaskDescription(oKRegularCell, 1000L, c18336fgV, oKRegularCell, this));
        C55068xcv c55068xcv = c16739epc.OLrzqt;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c55068xcv.getContext(), C52761wXj.TaskDescription.DGUQLI);
        if (drawable != null) {
            drawable.setBounds(0, 0, C55298xhM.dp2px$default(20.0f, null, 1, null), C55298xhM.dp2px$default(20.0f, null, 1, null));
        }
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(c55068xcv.getContext(), C52761wXj.Activity.QwvEab));
        }
        c55068xcv.setCompoundDrawablesRelative(null, null, drawable, null);
    }

    public final void KWHzl(android.content.Context context, C16739epc c16739epc) {
        int color = ContextCompat.getColor(context, C52761wXj.Activity.aappFQ);
        int color2 = ContextCompat.getColor(context, C52761wXj.Activity.aBDePw);
        int color3 = ContextCompat.getColor(context, C52761wXj.Activity.UlJrfe);
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        c55279xgu.isConnected(color);
        c55279xgu.AhwBna(color2);
        c55279xgu.AYXKKw(color2);
        c55279xgu.copydefault(true);
        C55280xgv c55280xgv = new C55280xgv();
        OKRegularCell root = c16739epc.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55280xgv.KWHzl(root, c55279xgu);
        c16739epc.AEQbTJ.EZpvd().setTextColor(color3);
        c16739epc.AEQbTJ.AEQbTJ().setTextColor(color3);
        c16739epc.OLrzqt.setCompoundDrawableTintList(android.content.res.ColorStateList.valueOf(color3));
    }

    /* JADX INFO: renamed from: o.fgT$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C18334fgT KWHzl;
        public final /* synthetic */ C18336fgV OLrzqt;
        public final /* synthetic */ OKRegularCell copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C18336fgV c18336fgV, OKRegularCell oKRegularCell, C18334fgT c18334fgT) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c18336fgV;
            this.copydefault = oKRegularCell;
            this.KWHzl = c18334fgT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityResultLauncher<ICloudNetworkListBean> activityResultLauncherKWHzl;
            java.lang.String walletName;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                OKRegularCell oKRegularCell = (OKRegularCell) this.EZpvd;
                if (this.OLrzqt.KWHzl()) {
                    android.content.Context context = this.copydefault.getContext();
                    ActivityC18363fgw activityC18363fgw = context instanceof ActivityC18363fgw ? (ActivityC18363fgw) context : null;
                    if (activityC18363fgw == null || (activityResultLauncherKWHzl = activityC18363fgw.KWHzl()) == null) {
                        return;
                    }
                    HDWalletBackupTypeBean backupTypeBean = this.OLrzqt.copydefault().getBackupTypeBean();
                    activityResultLauncherKWHzl.launch(new ICloudNetworkListBean((backupTypeBean == null || (walletName = backupTypeBean.getWalletName()) == null) ? "" : walletName, this.OLrzqt.copydefault(), this.OLrzqt.EZpvd(), 0, this.KWHzl.KWHzl()));
                    return;
                }
                android.content.Context context2 = oKRegularCell.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context2);
                viewOnClickListenerC54939xaY.EZpvd(oKRegularCell.getContext().getString(C13754dXa.FragmentManager.gZKUVK));
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.parameter, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}

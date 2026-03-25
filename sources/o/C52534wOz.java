package o;

import com.okinc.unify_trade.bot.data.TacticsListLabelRoleData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wOz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52534wOz {
    public static final C52534wOz KWHzl = new C52534wOz();

    private C52534wOz() {
    }

    public final C55251xgS copydefault(@NotNull android.content.Context context, @NotNull TacticsListLabelUiData tacticsListLabelUiData) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tacticsListLabelUiData, "");
        return AEQbTJ(new C55251xgS(context, null, 0, 6, null), tacticsListLabelUiData);
    }

    public final C55251xgS EZpvd(@NotNull C55251xgS c55251xgS, @NotNull TacticsListLabelUiData tacticsListLabelUiData) {
        Intrinsics.checkNotNullParameter(c55251xgS, "");
        Intrinsics.checkNotNullParameter(tacticsListLabelUiData, "");
        return AEQbTJ(c55251xgS, tacticsListLabelUiData);
    }

    public final C55251xgS AEQbTJ(C55251xgS c55251xgS, TacticsListLabelUiData tacticsListLabelUiData) {
        if (tacticsListLabelUiData instanceof TacticsListLabelRoleData) {
            TacticsListLabelRoleData tacticsListLabelRoleData = (TacticsListLabelRoleData) tacticsListLabelUiData;
            c55251xgS.setOKDSStyle(tacticsListLabelRoleData.OLrzqt());
            c55251xgS.setOKDSSize(tacticsListLabelRoleData.copydefault());
            c55251xgS.setShowIcon(false);
            c55251xgS.setText(tacticsListLabelRoleData.AEQbTJ());
        } else if (tacticsListLabelUiData instanceof TacticsListLabelVoucherData) {
            TacticsListLabelVoucherData tacticsListLabelVoucherData = (TacticsListLabelVoucherData) tacticsListLabelUiData;
            c55251xgS.setOKDSStyle(tacticsListLabelVoucherData.OLrzqt());
            c55251xgS.setOKDSSize(tacticsListLabelVoucherData.copydefault());
            android.content.res.Resources resources = c55251xgS.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            c55251xgS.setMaxWidth(C55302xhQ.EZpvd(resources));
            if (tacticsListLabelVoucherData.copydefault() == -4) {
                c55251xgS.setShowIcon(false);
                int iDp2px$default = C55298xhM.dp2px$default(14.0f, null, 1, null);
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.zqTOFw);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setBounds(0, 0, iDp2px$default, iDp2px$default);
                }
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.ixgjPv));
                }
                if (drawableKWHzl != null) {
                    drawableKWHzl.setAutoMirrored(false);
                }
                android.content.Context context = c55251xgS.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c55251xgS.setCompoundDrawablePadding(C55298xhM.copydefault(2.0f, context));
                c55251xgS.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
            } else {
                c55251xgS.setShowIcon(true);
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.zqTOFw);
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setAutoMirrored(false);
                }
                c55251xgS.setTagIcon(drawableKWHzl2);
            }
            c55251xgS.setText(tacticsListLabelVoucherData.AEQbTJ());
        } else {
            c55251xgS.setOKDSStyle(tacticsListLabelUiData.OLrzqt());
            c55251xgS.setOKDSSize(tacticsListLabelUiData.copydefault());
            c55251xgS.setText(tacticsListLabelUiData.AEQbTJ());
        }
        c55251xgS.setIncludeFontPadding(false);
        return c55251xgS;
    }
}

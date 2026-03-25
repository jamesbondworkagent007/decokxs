package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.im.imui.relationlist.model.ListButton;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37560owD extends DiffUtil.ItemCallback<java.lang.Object> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C34282nYe) && (obj2 instanceof C34282nYe)) {
            return Intrinsics.EZpvd((java.lang.Object) ((C34282nYe) obj).AhwBna(), (java.lang.Object) ((C34282nYe) obj2).AhwBna());
        }
        if ((obj instanceof ListButton) && (obj2 instanceof ListButton)) {
            return ((ListButton) obj).getDescription() == ((ListButton) obj2).getDescription();
        }
        if ((obj instanceof AbstractC37253oqO) && (obj2 instanceof AbstractC37253oqO)) {
            return Intrinsics.EZpvd(((AbstractC37253oqO) obj).KWHzl(), ((AbstractC37253oqO) obj2).KWHzl());
        }
        if (!(obj instanceof C37249oqK) || !(obj2 instanceof C37249oqK)) {
            if ((obj instanceof C37563owG) && (obj2 instanceof C37563owG)) {
                return Intrinsics.EZpvd((java.lang.Object) ((C37563owG) obj).OLrzqt().AhwBna(), (java.lang.Object) ((C37563owG) obj2).OLrzqt().AhwBna());
            }
            if ((obj instanceof C37247oqI) && (obj2 instanceof C37247oqI)) {
                return Intrinsics.EZpvd((java.lang.Object) ((C37247oqI) obj).copydefault().copydefault(), (java.lang.Object) ((C37247oqI) obj2).copydefault().copydefault());
            }
        }
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C34282nYe) && (obj2 instanceof C34282nYe)) {
            return AEQbTJ((C34282nYe) obj, (C34282nYe) obj2);
        }
        if ((obj instanceof ListButton) && (obj2 instanceof ListButton)) {
            return AEQbTJ((ListButton) obj, (ListButton) obj2);
        }
        if ((obj instanceof AbstractC37253oqO) && (obj2 instanceof AbstractC37253oqO)) {
            return copydefault((AbstractC37253oqO) obj, (AbstractC37253oqO) obj2);
        }
        if ((obj instanceof C37249oqK) && (obj2 instanceof C37249oqK)) {
            return true;
        }
        if ((obj instanceof C37563owG) && (obj2 instanceof C37563owG)) {
            return AEQbTJ((C37563owG) obj, (C37563owG) obj2);
        }
        if ((obj instanceof PhoneRelation) && (obj2 instanceof PhoneRelation)) {
            return EZpvd((PhoneRelation) obj, (PhoneRelation) obj2);
        }
        if ((obj instanceof C37247oqI) && (obj2 instanceof C37247oqI)) {
            return copydefault((C37247oqI) obj, (C37247oqI) obj2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public java.lang.Object getChangePayload(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C37563owG) && (obj2 instanceof C37563owG)) {
            return C37563owG.Companion.copydefault((C37563owG) obj, (C37563owG) obj2);
        }
        if ((obj instanceof C37247oqI) && (obj2 instanceof C37247oqI)) {
            return C37247oqI.Companion.OLrzqt((C37247oqI) obj, (C37247oqI) obj2);
        }
        return null;
    }

    public final boolean AEQbTJ(C34282nYe c34282nYe, C34282nYe c34282nYe2) {
        return Intrinsics.EZpvd((java.lang.Object) c34282nYe.AhwBna(), (java.lang.Object) c34282nYe2.AhwBna()) && Intrinsics.EZpvd((java.lang.Object) c34282nYe.OLrzqt(), (java.lang.Object) c34282nYe2.OLrzqt()) && Intrinsics.EZpvd((java.lang.Object) c34282nYe.AEQbTJ(), (java.lang.Object) c34282nYe2.AEQbTJ());
    }

    public final boolean AEQbTJ(ListButton listButton, ListButton listButton2) {
        return listButton.getDescription() == listButton2.getDescription() && listButton.getIconRes() == listButton2.getIconRes();
    }

    public final boolean copydefault(AbstractC37253oqO abstractC37253oqO, AbstractC37253oqO abstractC37253oqO2) {
        return Intrinsics.EZpvd(abstractC37253oqO.KWHzl(), abstractC37253oqO2.KWHzl());
    }

    public final boolean AEQbTJ(C37563owG c37563owG, C37563owG c37563owG2) {
        return Intrinsics.EZpvd((java.lang.Object) c37563owG.OLrzqt().AhwBna(), (java.lang.Object) c37563owG2.OLrzqt().AhwBna()) && Intrinsics.EZpvd((java.lang.Object) c37563owG.copydefault(), (java.lang.Object) c37563owG2.copydefault()) && c37563owG.KWHzl() == c37563owG2.KWHzl() && Intrinsics.EZpvd((java.lang.Object) c37563owG.OLrzqt().AEQbTJ(), (java.lang.Object) c37563owG2.OLrzqt().AEQbTJ());
    }

    public final boolean EZpvd(PhoneRelation phoneRelation, PhoneRelation phoneRelation2) {
        return Intrinsics.EZpvd((java.lang.Object) phoneRelation.getRawNumber(), (java.lang.Object) phoneRelation2.getRawNumber()) && Intrinsics.EZpvd((java.lang.Object) phoneRelation.getName(), (java.lang.Object) phoneRelation2.getName());
    }

    public final boolean copydefault(C37247oqI c37247oqI, C37247oqI c37247oqI2) {
        return Intrinsics.EZpvd((java.lang.Object) c37247oqI.copydefault().copydefault(), (java.lang.Object) c37247oqI2.copydefault().copydefault()) && Intrinsics.EZpvd((java.lang.Object) c37247oqI.copydefault().EZpvd(), (java.lang.Object) c37247oqI2.copydefault().EZpvd()) && Intrinsics.EZpvd((java.lang.Object) c37247oqI.AEQbTJ(), (java.lang.Object) c37247oqI2.AEQbTJ()) && Intrinsics.EZpvd((java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37247oqI.copydefault().OLrzqt())).getRawNumber(), (java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37247oqI2.copydefault().OLrzqt())).getRawNumber()) && c37247oqI.copydefault().OLrzqt().size() == c37247oqI2.copydefault().OLrzqt().size();
    }
}

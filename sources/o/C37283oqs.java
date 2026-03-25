package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.im.imui.relationlist.model.ListButton;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37283oqs extends DiffUtil.ItemCallback<java.lang.Object> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof RelationInfo) && (obj2 instanceof RelationInfo)) {
            return Intrinsics.EZpvd((java.lang.Object) ((RelationInfo) obj).getContactsId(), (java.lang.Object) ((RelationInfo) obj2).getContactsId());
        }
        if ((obj instanceof ListButton) && (obj2 instanceof ListButton)) {
            return ((ListButton) obj).getDescription() == ((ListButton) obj2).getDescription();
        }
        if ((obj instanceof AbstractC37253oqO) && (obj2 instanceof AbstractC37253oqO)) {
            return Intrinsics.EZpvd(((AbstractC37253oqO) obj).KWHzl(), ((AbstractC37253oqO) obj2).KWHzl());
        }
        if (!(obj instanceof C37249oqK) || !(obj2 instanceof C37249oqK)) {
            if ((obj instanceof C37244oqF) && (obj2 instanceof C37244oqF)) {
                return Intrinsics.EZpvd((java.lang.Object) ((C37244oqF) obj).OLrzqt().getContactsId(), (java.lang.Object) ((C37244oqF) obj2).OLrzqt().getContactsId());
            }
            if (!(obj instanceof PhoneRelation) || !(obj2 instanceof PhoneRelation)) {
                if ((obj instanceof C37247oqI) && (obj2 instanceof C37247oqI)) {
                    return Intrinsics.EZpvd((java.lang.Object) ((C37247oqI) obj).copydefault().copydefault(), (java.lang.Object) ((C37247oqI) obj2).copydefault().copydefault());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof RelationInfo) && (obj2 instanceof RelationInfo)) {
            RelationInfo relationInfo = (RelationInfo) obj;
            RelationInfo relationInfo2 = (RelationInfo) obj2;
            if (Intrinsics.EZpvd((java.lang.Object) relationInfo.getContactsId(), (java.lang.Object) relationInfo2.getContactsId()) && Intrinsics.EZpvd((java.lang.Object) relationInfo.getAvatar(), (java.lang.Object) relationInfo2.getAvatar()) && Intrinsics.EZpvd((java.lang.Object) relationInfo.getNickName(), (java.lang.Object) relationInfo2.getNickName()) && Intrinsics.EZpvd((java.lang.Object) relationInfo.getEnNickName(), (java.lang.Object) relationInfo2.getEnNickName()) && Intrinsics.EZpvd((java.lang.Object) relationInfo.getRemarkName(), (java.lang.Object) relationInfo2.getRemarkName()) && Intrinsics.EZpvd((java.lang.Object) relationInfo.getPhoneName(), (java.lang.Object) relationInfo2.getPhoneName())) {
                return true;
            }
        } else if ((obj instanceof ListButton) && (obj2 instanceof ListButton)) {
            ListButton listButton = (ListButton) obj;
            ListButton listButton2 = (ListButton) obj2;
            if (listButton.getDescription() == listButton2.getDescription() && listButton.getIconRes() == listButton2.getIconRes()) {
                return true;
            }
        } else {
            if ((obj instanceof AbstractC37253oqO) && (obj2 instanceof AbstractC37253oqO)) {
                return Intrinsics.EZpvd(((AbstractC37253oqO) obj).KWHzl(), ((AbstractC37253oqO) obj2).KWHzl());
            }
            if ((obj instanceof C37249oqK) && (obj2 instanceof C37249oqK)) {
                return true;
            }
            if ((obj instanceof C37244oqF) && (obj2 instanceof C37244oqF)) {
                C37244oqF c37244oqF = (C37244oqF) obj;
                C37244oqF c37244oqF2 = (C37244oqF) obj2;
                if (Intrinsics.EZpvd((java.lang.Object) c37244oqF.OLrzqt().getContactsId(), (java.lang.Object) c37244oqF2.OLrzqt().getContactsId()) && Intrinsics.EZpvd((java.lang.Object) c37244oqF.copydefault(), (java.lang.Object) c37244oqF2.copydefault()) && c37244oqF.KWHzl() == c37244oqF2.KWHzl() && Intrinsics.EZpvd((java.lang.Object) C44157sFk.getDisplayName$default(c37244oqF.OLrzqt(), null, 1, null), (java.lang.Object) C44157sFk.getDisplayName$default(c37244oqF2.OLrzqt(), null, 1, null)) && Intrinsics.EZpvd((java.lang.Object) c37244oqF.OLrzqt().getPhoneRawNumber(), (java.lang.Object) c37244oqF2.OLrzqt().getPhoneRawNumber())) {
                    return true;
                }
            } else if ((obj instanceof PhoneRelation) && (obj2 instanceof PhoneRelation)) {
                PhoneRelation phoneRelation = (PhoneRelation) obj;
                PhoneRelation phoneRelation2 = (PhoneRelation) obj2;
                if (Intrinsics.EZpvd((java.lang.Object) phoneRelation.getRawNumber(), (java.lang.Object) phoneRelation2.getRawNumber()) && Intrinsics.EZpvd((java.lang.Object) phoneRelation.getName(), (java.lang.Object) phoneRelation2.getName())) {
                    return true;
                }
            } else if ((obj instanceof C37247oqI) && (obj2 instanceof C37247oqI)) {
                C37247oqI c37247oqI = (C37247oqI) obj;
                C37247oqI c37247oqI2 = (C37247oqI) obj2;
                if (Intrinsics.EZpvd((java.lang.Object) c37247oqI.copydefault().copydefault(), (java.lang.Object) c37247oqI2.copydefault().copydefault()) && Intrinsics.EZpvd((java.lang.Object) c37247oqI.copydefault().EZpvd(), (java.lang.Object) c37247oqI2.copydefault().EZpvd()) && Intrinsics.EZpvd((java.lang.Object) c37247oqI.AEQbTJ(), (java.lang.Object) c37247oqI2.AEQbTJ()) && Intrinsics.EZpvd((java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37247oqI.copydefault().OLrzqt())).getRawNumber(), (java.lang.Object) ((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37247oqI2.copydefault().OLrzqt())).getRawNumber()) && c37247oqI.copydefault().OLrzqt().size() == c37247oqI2.copydefault().OLrzqt().size()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public java.lang.Object getChangePayload(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C37244oqF) && (obj2 instanceof C37244oqF)) {
            return C37244oqF.Companion.copydefault((C37244oqF) obj, (C37244oqF) obj2);
        }
        if ((obj instanceof C37247oqI) && (obj2 instanceof C37247oqI)) {
            return C37247oqI.Companion.OLrzqt((C37247oqI) obj, (C37247oqI) obj2);
        }
        return null;
    }
}

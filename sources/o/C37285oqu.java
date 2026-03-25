package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37285oqu extends DiffUtil.ItemCallback<java.lang.Object> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof RelationInfo) && (obj2 instanceof RelationInfo)) {
            return Intrinsics.EZpvd((java.lang.Object) ((RelationInfo) obj).getContactsId(), (java.lang.Object) ((RelationInfo) obj2).getContactsId());
        }
        return false;
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
        }
        return false;
    }
}

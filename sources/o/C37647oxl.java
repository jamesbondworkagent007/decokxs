package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.share.ShareTarget;
import com.okinc.okimcore.model.share.ShareTargetType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37647oxl extends DiffUtil.ItemCallback<ShareTarget> {

    /* JADX INFO: renamed from: o.oxl$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShareTargetType.values().length];
            try {
                iArr[ShareTargetType.Conversation.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ShareTargetType.Contact.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull ShareTarget shareTarget, @NotNull ShareTarget shareTarget2) {
        Intrinsics.checkNotNullParameter(shareTarget, "");
        Intrinsics.checkNotNullParameter(shareTarget2, "");
        int i = ActionBar.OLrzqt[shareTarget2.djBIcL().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (shareTarget.djBIcL() == shareTarget2.djBIcL() && Intrinsics.EZpvd((java.lang.Object) shareTarget.OLrzqt(), (java.lang.Object) shareTarget2.OLrzqt())) {
                return true;
            }
        } else if (shareTarget.djBIcL() == shareTarget2.djBIcL() && Intrinsics.EZpvd((java.lang.Object) shareTarget.copydefault(), (java.lang.Object) shareTarget2.copydefault())) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull ShareTarget shareTarget, @NotNull ShareTarget shareTarget2) {
        Intrinsics.checkNotNullParameter(shareTarget, "");
        Intrinsics.checkNotNullParameter(shareTarget2, "");
        if (Intrinsics.EZpvd((java.lang.Object) shareTarget.EZpvd(), (java.lang.Object) shareTarget2.EZpvd()) && Intrinsics.EZpvd((java.lang.Object) shareTarget.AEQbTJ(), (java.lang.Object) shareTarget2.AEQbTJ()) && Intrinsics.EZpvd((java.lang.Object) shareTarget.gEmmrt(), (java.lang.Object) shareTarget2.gEmmrt()) && Intrinsics.EZpvd(shareTarget.AYXKKw(), shareTarget2.AYXKKw())) {
            OKConversationType oKConversationTypeKWHzl = shareTarget.KWHzl();
            java.lang.Integer numValueOf = oKConversationTypeKWHzl != null ? java.lang.Integer.valueOf(oKConversationTypeKWHzl.getValue()) : null;
            OKConversationType oKConversationTypeKWHzl2 = shareTarget2.KWHzl();
            if (Intrinsics.EZpvd(numValueOf, oKConversationTypeKWHzl2 != null ? java.lang.Integer.valueOf(oKConversationTypeKWHzl2.getValue()) : null)) {
                return true;
            }
        }
        return false;
    }
}

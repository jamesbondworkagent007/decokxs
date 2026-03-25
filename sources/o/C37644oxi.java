package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.share.ShareTargetType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37644oxi extends DiffUtil.ItemCallback<C37580owX> {

    /* JADX INFO: renamed from: o.oxi$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
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
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull C37580owX c37580owX, @NotNull C37580owX c37580owX2) {
        Intrinsics.checkNotNullParameter(c37580owX, "");
        Intrinsics.checkNotNullParameter(c37580owX2, "");
        int i = StateListAnimator.OLrzqt[c37580owX2.OLrzqt().djBIcL().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (c37580owX.OLrzqt().djBIcL() == c37580owX2.OLrzqt().djBIcL() && Intrinsics.EZpvd((java.lang.Object) c37580owX.OLrzqt().OLrzqt(), (java.lang.Object) c37580owX2.OLrzqt().OLrzqt())) {
                return true;
            }
        } else if (c37580owX.OLrzqt().djBIcL() == c37580owX2.OLrzqt().djBIcL() && Intrinsics.EZpvd((java.lang.Object) c37580owX.OLrzqt().copydefault(), (java.lang.Object) c37580owX2.OLrzqt().copydefault())) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull C37580owX c37580owX, @NotNull C37580owX c37580owX2) {
        Intrinsics.checkNotNullParameter(c37580owX, "");
        Intrinsics.checkNotNullParameter(c37580owX2, "");
        if (Intrinsics.EZpvd((java.lang.Object) c37580owX.OLrzqt().EZpvd(), (java.lang.Object) c37580owX2.OLrzqt().EZpvd()) && Intrinsics.EZpvd((java.lang.Object) c37580owX.OLrzqt().AEQbTJ(), (java.lang.Object) c37580owX2.OLrzqt().AEQbTJ()) && Intrinsics.EZpvd((java.lang.Object) c37580owX.OLrzqt().gEmmrt(), (java.lang.Object) c37580owX2.OLrzqt().gEmmrt()) && Intrinsics.EZpvd(c37580owX.OLrzqt().AYXKKw(), c37580owX2.OLrzqt().AYXKKw())) {
            OKConversationType oKConversationTypeKWHzl = c37580owX.OLrzqt().KWHzl();
            java.lang.Integer numValueOf = oKConversationTypeKWHzl != null ? java.lang.Integer.valueOf(oKConversationTypeKWHzl.getValue()) : null;
            OKConversationType oKConversationTypeKWHzl2 = c37580owX2.OLrzqt().KWHzl();
            if (Intrinsics.EZpvd(numValueOf, oKConversationTypeKWHzl2 != null ? java.lang.Integer.valueOf(oKConversationTypeKWHzl2.getValue()) : null) && Intrinsics.EZpvd((java.lang.Object) c37580owX.EZpvd(), (java.lang.Object) c37580owX2.EZpvd()) && c37580owX.AEQbTJ() == c37580owX2.AEQbTJ()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object getChangePayload(@NotNull C37580owX c37580owX, @NotNull C37580owX c37580owX2) {
        Intrinsics.checkNotNullParameter(c37580owX, "");
        Intrinsics.checkNotNullParameter(c37580owX2, "");
        return C37580owX.Companion.OLrzqt(c37580owX, c37580owX2);
    }
}

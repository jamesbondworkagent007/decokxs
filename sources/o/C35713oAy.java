package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.message.provider.MessageReactionUIHelper$bindUI$1$1$1$1;
import com.okinc.im.message.provider.MessageReactionUIHelper$bindUI$1$2$1$1;
import com.okinc.im.view.MessageReaction;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.ReactionAction;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C35713oAy {
    public static final C35713oAy KWHzl = new C35713oAy();

    /* JADX INFO: renamed from: o.oAy$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SendReactionAction.values().length];
            try {
                iArr[SendReactionAction.REMOVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SendReactionAction.ADD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    private C35713oAy() {
    }

    public final void EZpvd(@NotNull final C35884oHg c35884oHg, @NotNull final java.util.List<ReactionDisplay> list, boolean z, @NotNull final java.lang.String str, final long j, final OKConversationType oKConversationType, OKConversation oKConversation, com.okinc.okimcore.model.remote.UserInfo userInfo, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(c35884oHg, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        c35884oHg.setReactions(oKConversationType, list, oKConversation, userInfo, z, z2);
        if (z3) {
            c35884oHg.setOnReactionClickListener(new Function1() { // from class: o.oAw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35713oAy.copydefault(c35884oHg, str, j, list, (MessageReaction) obj);
                }
            });
            c35884oHg.setOnShowAllReactionsClickListener(new Function0() { // from class: o.oAv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35713oAy.OLrzqt(c35884oHg, str, j, oKConversationType);
                }
            });
        } else {
            c35884oHg.setOnReactionClickListener(null);
            c35884oHg.setOnShowAllReactionsClickListener(null);
        }
    }

    public static final Unit copydefault(C35884oHg c35884oHg, java.lang.String str, long j, java.util.List list, MessageReaction messageReaction) {
        Intrinsics.checkNotNullParameter(messageReaction, "");
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(c35884oHg.getContext());
        AbstractActivityC33041mov abstractActivityC33041mov = contextOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) contextOLrzqt : null;
        if (abstractActivityC33041mov != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new MessageReactionUIHelper$bindUI$1$1$1$1(messageReaction, str, j, list, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C35884oHg c35884oHg, java.lang.String str, long j, OKConversationType oKConversationType) {
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(c35884oHg.getContext());
        AbstractActivityC33041mov abstractActivityC33041mov = contextOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) contextOLrzqt : null;
        if (abstractActivityC33041mov != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new MessageReactionUIHelper$bindUI$1$2$1$1(str, j, oKConversationType, abstractActivityC33041mov, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final java.util.List<ReactionDisplay> AEQbTJ(@NotNull java.util.List<ReactionDisplay> list, @NotNull WSSendReactionData wSSendReactionData) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(wSSendReactionData, "");
        if (wSSendReactionData.getEmojiActions().isEmpty()) {
            return list;
        }
        java.util.List<ReactionDisplay> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFJNWhG, 10));
        int i = 0;
        for (java.lang.Object obj : listFJNWhG) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(C56390yDp.OLrzqt(((ReactionDisplay) obj).getEmoji(), java.lang.Integer.valueOf(i)));
            i++;
        }
        java.util.Map<java.lang.String, java.lang.Integer> mapIsConnected = C56424yEw.isConnected(C56424yEw.copydefault(arrayList));
        for (ReactionAction reactionAction : wSSendReactionData.getEmojiActions()) {
            java.lang.String emoji = reactionAction.getEmoji();
            if (emoji == null) {
                emoji = "";
            }
            SendReactionAction action = reactionAction.getAction();
            int i2 = action == null ? -1 : TaskDescription.EZpvd[action.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    KWHzl.OLrzqt(emoji, listFJNWhG, mapIsConnected);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    KWHzl.copydefault(emoji, listFJNWhG, mapIsConnected);
                }
            }
        }
        return sSX.KWHzl.copydefault(listFJNWhG);
    }

    public final void copydefault(java.lang.String str, java.util.List<ReactionDisplay> list, java.util.Map<java.lang.String, java.lang.Integer> map) {
        java.lang.Integer num = map.get(str);
        if (num != null && num.intValue() < list.size()) {
            ReactionDisplay reactionDisplay = list.get(num.intValue());
            list.set(num.intValue(), new ReactionDisplay(reactionDisplay.getEmoji(), reactionDisplay.getCount() + 1, true));
        } else {
            ReactionDisplay reactionDisplay2 = new ReactionDisplay(str, 1, true);
            int size = list.size();
            list.add(reactionDisplay2);
            map.put(str, java.lang.Integer.valueOf(size));
        }
    }

    public final void OLrzqt(java.lang.String str, java.util.List<ReactionDisplay> list, java.util.Map<java.lang.String, java.lang.Integer> map) {
        java.lang.Integer num = map.get(str);
        if (num == null || num.intValue() >= list.size()) {
            return;
        }
        ReactionDisplay reactionDisplay = list.get(num.intValue());
        if (reactionDisplay.isCurrentUserReaction()) {
            if (reactionDisplay.getCount() > 1) {
                list.set(num.intValue(), new ReactionDisplay(reactionDisplay.getEmoji(), reactionDisplay.getCount() - 1, false));
                return;
            }
            list.remove(num.intValue());
            map.remove(str);
            for (Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                int iIntValue = entry.getValue().intValue();
                if (iIntValue > num.intValue()) {
                    map.put(key, java.lang.Integer.valueOf(iIntValue - 1));
                }
            }
        }
    }

    public final void EZpvd(@NotNull C35884oHg c35884oHg) {
        Intrinsics.checkNotNullParameter(c35884oHg, "");
        int iDp2px$default = C55298xhM.dp2px$default(8.0f, null, 1, null);
        int iDp2px$default2 = C55298xhM.dp2px$default(8.0f, null, 1, null);
        c35884oHg.setPaddingRelative(iDp2px$default2, 0, iDp2px$default2, iDp2px$default);
    }

    public final void AEQbTJ(@NotNull C35884oHg c35884oHg) {
        Intrinsics.checkNotNullParameter(c35884oHg, "");
        int iDp2px$default = C55298xhM.dp2px$default(4.0f, null, 1, null);
        c35884oHg.setPaddingRelative(0, iDp2px$default, 0, iDp2px$default);
    }
}

package com.okinc.im.widgets.bottomsheet.viewmodel;

import androidx.lifecycle.ViewModel;
import com.okinc.im.widgets.bottomsheet.model.ReactionBottomSheetData;
import com.okinc.im.widgets.bottomsheet.model.ReactionTab;
import com.okinc.im.widgets.bottomsheet.model.ReactionUser;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionUserDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C44157sFk;
import o.C56403yEb;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageReactionsViewModel extends ViewModel {
    public final StateFlow<ReactionBottomSheetData> AEQbTJ;
    public final MutableStateFlow<Integer> EZpvd;
    public List<ReactionDetail> KWHzl;
    public final MutableStateFlow<Integer> OLrzqt;
    public final MutableStateFlow<ReactionBottomSheetData> copydefault;
    public final StateFlow<Integer> djBIcL;
    public final StateFlow<Integer> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionDetail> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ReactionBottomSheetData> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public MessageReactionsViewModel() {
        MutableStateFlow<ReactionBottomSheetData> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(-1);
        this.OLrzqt = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.EZpvd = MutableStateFlow3;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow3);
        this.KWHzl = yDY.AhwBna();
    }

    public final void EZpvd(@NotNull List<ReactionDetail> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        ReactionBottomSheetData reactionBottomSheetDataKWHzl = KWHzl(list);
        this.copydefault.setValue(reactionBottomSheetDataKWHzl);
        this.EZpvd.setValue(Integer.valueOf(reactionBottomSheetDataKWHzl.OLrzqt()));
        if (!reactionBottomSheetDataKWHzl.EZpvd().isEmpty()) {
            Iterator<ReactionTab> it = reactionBottomSheetDataKWHzl.EZpvd().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next().copydefault()) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            KWHzl(numValueOf != null ? numValueOf.intValue() : 0);
        }
    }

    public final boolean copydefault() {
        return !this.KWHzl.isEmpty();
    }

    public final void KWHzl(int i) {
        ReactionBottomSheetData value = this.copydefault.getValue();
        if (value == null || i < 0 || i >= value.EZpvd().size()) {
            return;
        }
        this.OLrzqt.setValue(Integer.valueOf(i));
    }

    public final void KWHzl(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        ReactionBottomSheetData value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        String strKWHzl = C44157sFk.KWHzl();
        List<ReactionTab> listEZpvd = value.EZpvd();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (ReactionTab reactionTabCopy$default : listEZpvd) {
            if (Intrinsics.EZpvd((Object) reactionTabCopy$default.KWHzl(), (Object) str)) {
                List<ReactionUser> listEZpvd2 = reactionTabCopy$default.EZpvd();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listEZpvd2) {
                    if (!Intrinsics.EZpvd((Object) ((ReactionUser) obj).copydefault(), (Object) strKWHzl)) {
                        arrayList2.add(obj);
                    }
                }
                reactionTabCopy$default = ReactionTab.copy$default(reactionTabCopy$default, null, arrayList2.size(), false, arrayList2, 5, null);
            }
            arrayList.add(reactionTabCopy$default);
        }
        Iterator it = arrayList.iterator();
        int iAEQbTJ = 0;
        while (it.hasNext()) {
            iAEQbTJ += ((ReactionTab) it.next()).AEQbTJ();
        }
        ReactionBottomSheetData reactionBottomSheetDataKWHzl = value.KWHzl(iAEQbTJ, arrayList);
        this.copydefault.setValue(reactionBottomSheetDataKWHzl);
        this.EZpvd.setValue(Integer.valueOf(reactionBottomSheetDataKWHzl.OLrzqt()));
        int iIntValue = this.OLrzqt.getValue().intValue();
        ReactionTab reactionTab = (ReactionTab) CollectionsKt___CollectionsKt.AkhnZx(value.EZpvd(), iIntValue);
        if (reactionTab != null && Intrinsics.EZpvd((Object) reactionTab.KWHzl(), (Object) str)) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.EZpvd((Object) ((ReactionTab) next).KWHzl(), (Object) str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (((ReactionTab) next) != null) {
                KWHzl(iIntValue);
            }
        }
    }

    public final ReactionBottomSheetData KWHzl(List<ReactionDetail> list) {
        ArrayList arrayList = new ArrayList();
        for (ReactionDetail reactionDetail : list) {
            String emoji = reactionDetail.getEmoji();
            int size = reactionDetail.getUserUids().size();
            boolean zIsCurrentUserReaction = reactionDetail.isCurrentUserReaction();
            List<ReactionUserDetail> userUids = reactionDetail.getUserUids();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(userUids, 10));
            for (ReactionUserDetail reactionUserDetail : userUids) {
                arrayList2.add(new ReactionUser(reactionUserDetail.getUserUid(), reactionUserDetail.getName(), reactionUserDetail.getAvatarUrl(), reactionUserDetail.getOfficialTagInfo(), reactionUserDetail.getGroupRole(), reactionDetail.getEmoji()));
            }
            arrayList.add(new ReactionTab(emoji, size, zIsCurrentUserReaction, arrayList2));
        }
        Iterator it = arrayList.iterator();
        int iAEQbTJ = 0;
        while (it.hasNext()) {
            iAEQbTJ += ((ReactionTab) it.next()).AEQbTJ();
        }
        return new ReactionBottomSheetData(iAEQbTJ, arrayList);
    }
}

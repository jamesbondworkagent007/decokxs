package o;

import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.UpdateAdminGroupMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYU extends AbstractC34300nYw<UpdateAdminGroupMessage> {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<UpdateAdminGroupMessage> KWHzl() {
        return UpdateAdminGroupMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        KWHzl((oGY<nLO>) ogy, c35254nrp, (UpdateAdminGroupMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull UpdateAdminGroupMessage updateAdminGroupMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(updateAdminGroupMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return OLrzqt(updateAdminGroupMessage);
    }

    public void KWHzl(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull UpdateAdminGroupMessage updateAdminGroupMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(updateAdminGroupMessage, "");
        super.AEQbTJ(ogy, c35254nrp, updateAdminGroupMessage);
        ((nLO) ogy.copydefault()).copydefault.setText(OLrzqt(updateAdminGroupMessage));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nYU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.CharSequence OLrzqt(UpdateAdminGroupMessage updateAdminGroupMessage) {
        java.lang.CharSequence charSequenceEZpvd;
        GroupSystemMessageInfo notifyInfo = updateAdminGroupMessage.getNotifyInfo();
        return (notifyInfo == null || (charSequenceEZpvd = EZpvd(updateAdminGroupMessage, EZpvd(updateAdminGroupMessage, notifyInfo))) == null) ? "" : charSequenceEZpvd;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final int EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;
        public final java.util.List<java.lang.String> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, java.lang.String str2, int i, @NotNull java.lang.String str3, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new StateListAnimator(z, str, list, str2, i, str3, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) stateListAnimator.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, stateListAnimator.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) stateListAnimator.AYXKKw) && this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && this.KWHzl == stateListAnimator.KWHzl && this.copydefault == stateListAnimator.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
            int iHashCode2 = this.AhwBna.hashCode();
            int iHashCode3 = this.gEmmrt.hashCode();
            java.lang.String str = this.AYXKKw;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DisplayData(isAppLangChinese=" + this.AEQbTJ + ", nameListSeparator=" + this.AhwBna + ", memberNames=" + this.gEmmrt + ", operatorNickname=" + this.AYXKKw + ", exceedUserNumber=" + this.EZpvd + ", exceedDisplayUserNumber=" + this.OLrzqt + ", isCurrentUserOperator=" + this.KWHzl + ", isCurrentUserInTargetList=" + this.copydefault + ")";
        }

        public StateListAnimator(boolean z, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, java.lang.String str2, int i, @NotNull java.lang.String str3, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.AEQbTJ = z;
            this.AhwBna = str;
            this.gEmmrt = list;
            this.AYXKKw = str2;
            this.EZpvd = i;
            this.OLrzqt = str3;
            this.KWHzl = z2;
            this.copydefault = z3;
        }
    }

    public final StateListAnimator EZpvd(UpdateAdminGroupMessage updateAdminGroupMessage, GroupSystemMessageInfo groupSystemMessageInfo) {
        java.util.ArrayList arrayList;
        boolean z;
        int size;
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        java.lang.String str = zOLrzqt ? "，" : ", ";
        java.util.List<SystemMessageData.UserInfo> targetUserDisplayList = groupSystemMessageInfo.getTargetUserDisplayList();
        if (targetUserDisplayList != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : targetUserDisplayList) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((SystemMessageData.UserInfo) obj).KWHzl(), (java.lang.Object) C44157sFk.KWHzl())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        java.util.List<java.lang.String> listCopydefault = sNV.copydefault(arrayList);
        java.lang.String strCopydefault = copydefault(groupSystemMessageInfo, zOLrzqt);
        java.lang.String strKWHzl = C44157sFk.KWHzl();
        java.lang.String operatorId = groupSystemMessageInfo.getOperatorId();
        if (operatorId == null || !Intrinsics.EZpvd((java.lang.Object) operatorId, (java.lang.Object) strKWHzl)) {
            operatorId = null;
        }
        boolean z2 = operatorId != null;
        java.util.List<java.lang.String> targetUserIds = groupSystemMessageInfo.getTargetUserIds();
        if (targetUserIds == null || targetUserIds.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = targetUserIds.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd(it.next(), (java.lang.Object) strKWHzl)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (!z) {
            java.util.List<java.lang.String> targetUserIds2 = groupSystemMessageInfo.getTargetUserIds();
            if (targetUserIds2 == null) {
                targetUserIds2 = yDY.AhwBna();
            }
            size = targetUserIds2.size() - 2;
        } else {
            java.util.List<java.lang.String> targetUserIds3 = groupSystemMessageInfo.getTargetUserIds();
            if (targetUserIds3 == null) {
                targetUserIds3 = yDY.AhwBna();
            }
            size = targetUserIds3.size() - 3;
        }
        int i = size;
        updateAdminGroupMessage.setTargetUsersExceedLimit(i > 0);
        StateListAnimator stateListAnimator = new StateListAnimator(zOLrzqt, str, listCopydefault, strCopydefault, i, pTB.formatLocalized$default(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), null, 1, null), z2, z);
        pUU.EZpvd("UpdateAdminMessageViewProvider", "prepareDisplayData:\n  memberNames: " + listCopydefault + "\n  operatorNickname: '" + strCopydefault + "'\n  exceedUserNumber: " + i + "\n  isCurrentUserOperator: " + z2 + "\n  isCurrentUserInTargetList: " + z + "\n  isTargetUsersExceedLimit: " + updateAdminGroupMessage.isTargetUsersExceedLimit() + "\n  info.targetUserIds: " + groupSystemMessageInfo.getTargetUserIds());
        return stateListAnimator;
    }

    public final java.lang.String copydefault(GroupSystemMessageInfo groupSystemMessageInfo, boolean z) {
        RelationInfo relationInfoKWHzl;
        java.lang.String displayName$default;
        java.lang.String operatorId = groupSystemMessageInfo.getOperatorId();
        return (operatorId == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId)) == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) ? sNV.copydefault(z, groupSystemMessageInfo.getOperatorNickname(), groupSystemMessageInfo.getOperatorEnNickname()) : displayName$default;
    }

    public final java.lang.CharSequence EZpvd(UpdateAdminGroupMessage updateAdminGroupMessage, StateListAnimator stateListAnimator) {
        if (updateAdminGroupMessage.isAddAdmin()) {
            return KWHzl(updateAdminGroupMessage, stateListAnimator);
        }
        return AEQbTJ(updateAdminGroupMessage, stateListAnimator);
    }

    public final java.lang.CharSequence KWHzl(UpdateAdminGroupMessage updateAdminGroupMessage, StateListAnimator stateListAnimator) {
        if (updateAdminGroupMessage.isTargetUsersExceedLimit()) {
            return EZpvd(stateListAnimator);
        }
        return AEQbTJ(stateListAnimator);
    }

    public final java.lang.CharSequence EZpvd(StateListAnimator stateListAnimator) {
        int i;
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(stateListAnimator.EZpvd(), stateListAnimator.OLrzqt(), null, null, 0, null, null, 62, null);
        if (stateListAnimator.gEmmrt()) {
            i = C35399nuc.Fragment.AuCTel;
        } else {
            i = stateListAnimator.AhwBna() ? C35399nuc.Fragment.AkhnZx : C35399nuc.Fragment.AhwBna;
        }
        java.lang.String strEZpvd = C33070mpX.EZpvd(i, stateListAnimator.KWHzl());
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("members", strJoinToString$default);
        java.lang.String strCopydefault = stateListAnimator.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("admin", strCopydefault);
        pairArr[2] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, stateListAnimator.AEQbTJ());
        return C33069mpW.OLrzqt(strEZpvd, C56424yEw.gEmmrt(pairArr));
    }

    public final java.lang.CharSequence AEQbTJ(StateListAnimator stateListAnimator) {
        int i;
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(stateListAnimator.EZpvd(), stateListAnimator.OLrzqt(), null, null, 0, null, null, 62, null);
        if (stateListAnimator.gEmmrt()) {
            i = C35399nuc.LoaderManager.OHqIaq;
        } else {
            i = stateListAnimator.AhwBna() ? C35399nuc.LoaderManager.GiPPlLRPuVlr : C35399nuc.LoaderManager.RcvFxC;
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = C56390yDp.OLrzqt("member", strJoinToString$default);
        java.lang.String strCopydefault = stateListAnimator.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("admin", strCopydefault);
        return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
    }

    public final java.lang.CharSequence AEQbTJ(UpdateAdminGroupMessage updateAdminGroupMessage, StateListAnimator stateListAnimator) {
        if (updateAdminGroupMessage.isTargetUsersExceedLimit()) {
            return OLrzqt(stateListAnimator);
        }
        if (stateListAnimator.AhwBna()) {
            return KWHzl(stateListAnimator);
        }
        return copydefault(stateListAnimator);
    }

    public final java.lang.CharSequence OLrzqt(StateListAnimator stateListAnimator) {
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(stateListAnimator.EZpvd(), stateListAnimator.OLrzqt(), null, null, 0, null, null, 62, null);
        java.lang.String strEZpvd = C33070mpX.EZpvd(stateListAnimator.gEmmrt() ? C35399nuc.Fragment.fARcdN : C35399nuc.Fragment.ejfBZ, stateListAnimator.KWHzl());
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("admins", strJoinToString$default);
        java.lang.String strCopydefault = stateListAnimator.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("admin1", strCopydefault);
        pairArr[2] = C56390yDp.OLrzqt("admin2", strJoinToString$default);
        pairArr[3] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, stateListAnimator.AEQbTJ());
        return C33069mpW.OLrzqt(strEZpvd, C56424yEw.gEmmrt(pairArr));
    }

    public final java.lang.CharSequence KWHzl(StateListAnimator stateListAnimator) {
        if (stateListAnimator.EZpvd().size() == 1) {
            int i = C35399nuc.LoaderManager.GqbzPL;
            java.lang.String strCopydefault = stateListAnimator.copydefault();
            return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("admin", strCopydefault != null ? strCopydefault : "")));
        }
        java.lang.String strEZpvd = C33070mpX.EZpvd(C35399nuc.Fragment.DbNXlk, stateListAnimator.KWHzl());
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String strCopydefault2 = stateListAnimator.copydefault();
        pairArr[0] = C56390yDp.OLrzqt("admin1", strCopydefault2 != null ? strCopydefault2 : "");
        pairArr[1] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(stateListAnimator.EZpvd().size() - 1));
        return C33069mpW.OLrzqt(strEZpvd, C56424yEw.gEmmrt(pairArr));
    }

    public final java.lang.CharSequence copydefault(StateListAnimator stateListAnimator) {
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(stateListAnimator.EZpvd(), stateListAnimator.OLrzqt(), null, null, 0, null, null, 62, null);
        int i = stateListAnimator.gEmmrt() ? C35399nuc.LoaderManager.QwvEab : C35399nuc.LoaderManager.getLocation;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("admin", strJoinToString$default);
        java.lang.String strCopydefault = stateListAnimator.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("name1", strCopydefault);
        pairArr[2] = C56390yDp.OLrzqt("name2", strJoinToString$default);
        pairArr[3] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, stateListAnimator.AEQbTJ());
        return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
    }
}

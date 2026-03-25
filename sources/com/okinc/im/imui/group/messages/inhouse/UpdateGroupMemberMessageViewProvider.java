package com.okinc.im.imui.group.messages.inhouse;

import android.content.Context;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.UpdateGroupMemberMessage;
import com.okinc.okimcore.model.im.inhouseim.ServiceScenarioType;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonIgnoreUnknownKeys;
import o.AbstractC34300nYw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33142mqq;
import o.C35254nrp;
import o.C35399nuc;
import o.C44157sFk;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.nLO;
import o.oGY;
import o.pTB;
import o.pUU;
import o.sDZ;
import o.sNV;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UpdateGroupMemberMessageViewProvider extends AbstractC34300nYw<UpdateGroupMemberMessage> {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public Class<UpdateGroupMemberMessage> KWHzl() {
        return UpdateGroupMemberMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        OLrzqt((oGY<nLO>) ogy, c35254nrp, (UpdateGroupMemberMessage) oKGroupNotificationMessage);
    }

    /* JADX INFO: loaded from: classes16.dex */
    @Serializable
    @JsonIgnoreUnknownKeys
    public static final class MessageExtra {
        public static final Companion Companion = new Companion(null);
        public final boolean isQrCode;
        public final String serviceScenarioType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public MessageExtra() {
            this(false, (String) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MessageExtra copy$default(MessageExtra messageExtra, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = messageExtra.isQrCode;
            }
            if ((i & 2) != 0) {
                str = messageExtra.serviceScenarioType;
            }
            return messageExtra.AEQbTJ(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MessageExtra AEQbTJ(boolean z, String str) {
            return new MessageExtra(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.isQrCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.serviceScenarioType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageExtra)) {
                return false;
            }
            MessageExtra messageExtra = (MessageExtra) obj;
            return this.isQrCode == messageExtra.isQrCode && Intrinsics.EZpvd((Object) this.serviceScenarioType, (Object) messageExtra.serviceScenarioType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isQrCode);
            String str = this.serviceScenarioType;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MessageExtra(isQrCode=" + this.isQrCode + ", serviceScenarioType=" + this.serviceScenarioType + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.messages.inhouse.UpdateGroupMemberMessageViewProvider.MessageExtra.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<MessageExtra> serializer() {
                return UpdateGroupMemberMessageViewProvider$MessageExtra$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ MessageExtra(int i, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.isQrCode = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.serviceScenarioType = null;
            } else {
                this.serviceScenarioType = str;
            }
        }

        public static final /* synthetic */ void EZpvd(MessageExtra messageExtra, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || messageExtra.isQrCode) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 0, messageExtra.isQrCode);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && messageExtra.serviceScenarioType == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, messageExtra.serviceScenarioType);
        }

        public MessageExtra(boolean z, String str) {
            this.isQrCode = z;
            this.serviceScenarioType = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(boolean, java.lang.String):void (m)] (LINE:38) call: com.okinc.im.imui.group.messages.inhouse.UpdateGroupMemberMessageViewProvider.MessageExtra.<init>(boolean, java.lang.String):void type: THIS */
        public /* synthetic */ MessageExtra(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CharSequence KWHzl(@NotNull Context context, @NotNull UpdateGroupMemberMessage updateGroupMemberMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(updateGroupMemberMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return KWHzl(updateGroupMemberMessage);
    }

    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull UpdateGroupMemberMessage updateGroupMemberMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(updateGroupMemberMessage, "");
        super.AEQbTJ(ogy, c35254nrp, updateGroupMemberMessage);
        AEQbTJ(ogy, new UpdateGroupMemberMessageViewProvider$onBindGroupNotificationMessage$1$1(this, updateGroupMemberMessage, (nLO) ogy.copydefault(), null));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.messages.inhouse.UpdateGroupMemberMessageViewProvider.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final CharSequence KWHzl(UpdateGroupMemberMessage updateGroupMemberMessage) {
        CharSequence charSequenceEZpvd;
        GroupSystemMessageInfo notifyInfo = updateGroupMemberMessage.getNotifyInfo();
        return (notifyInfo == null || (charSequenceEZpvd = EZpvd(updateGroupMemberMessage, OLrzqt(updateGroupMemberMessage, notifyInfo))) == null) ? "" : charSequenceEZpvd;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public final String AEQbTJ;
        public final boolean AYXKKw;
        public final List<String> AhwBna;
        public final int EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;
        public final boolean djBIcL;
        public final String gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(boolean z, @NotNull String str, @NotNull List<String> list, String str2, int i, @NotNull String str3, boolean z2, boolean z3, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Application(z, str, list, str2, i, str3, z2, z3, z4, z5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.KWHzl == application.KWHzl && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) application.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, application.AhwBna) && Intrinsics.EZpvd((Object) this.valueOf, (Object) application.valueOf) && this.EZpvd == application.EZpvd && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ) && this.copydefault == application.copydefault && this.OLrzqt == application.OLrzqt && this.AYXKKw == application.AYXKKw && this.djBIcL == application.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.KWHzl);
            int iHashCode2 = this.gEmmrt.hashCode();
            int iHashCode3 = this.AhwBna.hashCode();
            String str = this.valueOf;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DisplayData(isAppLangChinese=" + this.KWHzl + ", nameListSeparator=" + this.gEmmrt + ", memberNames=" + this.AhwBna + ", operatorNickname=" + this.valueOf + ", exceedUserNumber=" + this.EZpvd + ", exceedDisplayUserNumber=" + this.AEQbTJ + ", isCurrentUserOperator=" + this.copydefault + ", isCurrentUserInTargetList=" + this.OLrzqt + ", isQrCode=" + this.AYXKKw + ", isTradingCompetition=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.copydefault;
        }

        public Application(boolean z, @NotNull String str, @NotNull List<String> list, String str2, int i, @NotNull String str3, boolean z2, boolean z3, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.KWHzl = z;
            this.gEmmrt = str;
            this.AhwBna = list;
            this.valueOf = str2;
            this.EZpvd = i;
            this.AEQbTJ = str3;
            this.copydefault = z2;
            this.OLrzqt = z3;
            this.AYXKKw = z4;
            this.djBIcL = z5;
        }
    }

    public final Application OLrzqt(UpdateGroupMemberMessage updateGroupMemberMessage, GroupSystemMessageInfo groupSystemMessageInfo) {
        ArrayList arrayList;
        boolean z;
        int size;
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        String str = zOLrzqt ? "，" : ", ";
        List<SystemMessageData.UserInfo> targetUserDisplayList = groupSystemMessageInfo.getTargetUserDisplayList();
        if (targetUserDisplayList != null) {
            arrayList = new ArrayList();
            for (Object obj : targetUserDisplayList) {
                if (!Intrinsics.EZpvd((Object) ((SystemMessageData.UserInfo) obj).KWHzl(), (Object) C44157sFk.KWHzl())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List<String> listCopydefault = sNV.copydefault(arrayList);
        String strCopydefault = copydefault(groupSystemMessageInfo, zOLrzqt);
        String strKWHzl = C44157sFk.KWHzl();
        String operatorId = groupSystemMessageInfo.getOperatorId();
        if (operatorId == null || !Intrinsics.EZpvd((Object) operatorId, (Object) strKWHzl)) {
            operatorId = null;
        }
        boolean z2 = operatorId != null;
        List<String> targetUserIds = groupSystemMessageInfo.getTargetUserIds();
        if (targetUserIds == null || targetUserIds.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = targetUserIds.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd(it.next(), (Object) strKWHzl)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (!z) {
            List<String> targetUserIds2 = groupSystemMessageInfo.getTargetUserIds();
            if (targetUserIds2 == null) {
                targetUserIds2 = yDY.AhwBna();
            }
            size = targetUserIds2.size() - 2;
        } else {
            List<String> targetUserIds3 = groupSystemMessageInfo.getTargetUserIds();
            if (targetUserIds3 == null) {
                targetUserIds3 = yDY.AhwBna();
            }
            size = targetUserIds3.size() - 3;
        }
        int i = size;
        Pair<Boolean, Boolean> pairAEQbTJ = AEQbTJ(updateGroupMemberMessage);
        boolean zBooleanValue = pairAEQbTJ.component1().booleanValue();
        boolean zBooleanValue2 = pairAEQbTJ.component2().booleanValue();
        updateGroupMemberMessage.setTargetUsersExceedLimit(i > 0);
        Application application = new Application(zOLrzqt, str, listCopydefault, strCopydefault, i, pTB.formatLocalized$default(C33129mqd.gEmmrt(Integer.valueOf(i)), null, 1, null), z2, z, zBooleanValue, zBooleanValue2);
        pUU.EZpvd("UpdateGroupMemberMessageViewProvider", "prepareDisplayData:\n  memberNames: " + listCopydefault + "\n  operatorNickname: '" + strCopydefault + "'\n  exceedUserNumber: " + i + "\n  isCurrentUserOperator: " + z2 + "\n  isCurrentUserInTargetList: " + z + "\n  isQrCode: " + zBooleanValue + "\n  isTradingCompetition: " + zBooleanValue2 + "\n  isTargetUsersExceedLimit: " + updateGroupMemberMessage.isTargetUsersExceedLimit() + "\n  info.targetUserIds: " + groupSystemMessageInfo.getTargetUserIds());
        return application;
    }

    private final String copydefault(GroupSystemMessageInfo groupSystemMessageInfo, boolean z) {
        RelationInfo relationInfoKWHzl;
        String displayName$default;
        String operatorId = groupSystemMessageInfo.getOperatorId();
        return (operatorId == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId)) == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) ? sNV.copydefault(z, groupSystemMessageInfo.getOperatorNickname(), groupSystemMessageInfo.getOperatorEnNickname()) : displayName$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:3:0x0002, B:5:0x0020, B:8:0x003b, B:7:0x0033), top: B:13:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Boolean, Boolean> AEQbTJ(UpdateGroupMemberMessage updateGroupMemberMessage) {
        MessageExtra messageExtra;
        try {
            pUU.EZpvd("UpdateGroupMemberMessageViewProvider", "getDisplayText decode extra: " + updateGroupMemberMessage.getExtra());
            String extra = updateGroupMemberMessage.getExtra();
            if (extra != null) {
                Json.Default r1 = Json.Default;
                r1.getSerializersModule();
                messageExtra = (MessageExtra) r1.decodeFromString(MessageExtra.Companion.serializer(), extra);
                if (messageExtra == null) {
                    messageExtra = new MessageExtra(false, (String) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }
            }
            return C56390yDp.OLrzqt(Boolean.valueOf(messageExtra.AEQbTJ()), Boolean.valueOf(Intrinsics.EZpvd((Object) messageExtra.EZpvd(), (Object) ServiceScenarioType.TRADING_COMPETITION.getValue())));
        } catch (Exception e) {
            pUU.AEQbTJ("UpdateGroupMemberMessageViewProvider", "getDisplayText decode extra error", e);
            Boolean bool = Boolean.FALSE;
            return C56390yDp.OLrzqt(bool, bool);
        }
    }

    public final CharSequence EZpvd(UpdateGroupMemberMessage updateGroupMemberMessage, Application application) {
        if (updateGroupMemberMessage.isAddMember()) {
            return KWHzl(updateGroupMemberMessage, application);
        }
        return OLrzqt(updateGroupMemberMessage, application);
    }

    public final CharSequence KWHzl(UpdateGroupMemberMessage updateGroupMemberMessage, Application application) {
        if (updateGroupMemberMessage.isTargetUsersExceedLimit()) {
            return OLrzqt(application);
        }
        if (application.gEmmrt()) {
            return KWHzl(application);
        }
        if (application.AYXKKw()) {
            return C33069mpW.copydefault(C35399nuc.LoaderManager.ODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("user", CollectionsKt___CollectionsKt.joinToString$default(application.OLrzqt(), application.AEQbTJ(), null, null, 0, null, null, 62, null))));
        }
        if (application.djBIcL()) {
            return C33069mpW.copydefault(C35399nuc.LoaderManager.sbu, C56423yEv.EZpvd(C56390yDp.OLrzqt("userName", CollectionsKt___CollectionsKt.joinToString$default(application.OLrzqt(), application.AEQbTJ(), null, null, 0, null, null, 62, null))));
        }
        return copydefault(application);
    }

    public final CharSequence OLrzqt(Application application) {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((Iterable) application.OLrzqt(), 2), application.AEQbTJ(), null, null, 0, null, null, 62, null);
        String strEZpvd = C33070mpX.EZpvd(application.valueOf() ? C35399nuc.Fragment.fJNWhG : C35399nuc.Fragment.djBIcL, application.copydefault());
        Pair[] pairArr = new Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("users", strJoinToString$default);
        String strEZpvd2 = application.EZpvd();
        if (strEZpvd2 == null) {
            strEZpvd2 = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("user1", strEZpvd2);
        pairArr[2] = C56390yDp.OLrzqt("user2", strJoinToString$default);
        pairArr[3] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, application.KWHzl());
        return C33069mpW.OLrzqt(strEZpvd, C56424yEw.gEmmrt(pairArr));
    }

    public final CharSequence KWHzl(Application application) {
        if (application.djBIcL()) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKDIADVb);
        }
        int i = C35399nuc.LoaderManager.sElUiK;
        String strEZpvd = application.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("name1", strEZpvd)));
    }

    public final CharSequence copydefault(Application application) {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(application.OLrzqt(), application.AEQbTJ(), null, null, 0, null, null, 62, null);
        int i = application.valueOf() ? C35399nuc.LoaderManager.ODXsMY : C35399nuc.LoaderManager.pause;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("user", strJoinToString$default);
        String strEZpvd = application.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("name1", strEZpvd);
        pairArr[2] = C56390yDp.OLrzqt("name2", strJoinToString$default);
        return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
    }

    public final CharSequence OLrzqt(UpdateGroupMemberMessage updateGroupMemberMessage, Application application) {
        if (application.djBIcL()) {
            return copydefault(updateGroupMemberMessage, application);
        }
        if (updateGroupMemberMessage.isTargetUsersExceedLimit()) {
            return EZpvd(application);
        }
        if (application.gEmmrt()) {
            return AhwBna(application);
        }
        return AEQbTJ(application);
    }

    public final CharSequence AhwBna(Application application) {
        if (application.djBIcL()) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.svY);
        }
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.sSi);
    }

    public final CharSequence copydefault(UpdateGroupMemberMessage updateGroupMemberMessage, Application application) {
        if (application.gEmmrt()) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKDCKfqP);
        }
        if (updateGroupMemberMessage.isTargetUsersExceedLimit()) {
            return C33069mpW.OLrzqt(C33070mpX.EZpvd(C35399nuc.Fragment.AYXKKw, application.copydefault()), C56424yEw.gEmmrt(C56390yDp.OLrzqt("user", CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((Iterable) application.OLrzqt(), 2), application.AEQbTJ(), null, null, 0, null, null, 62, null)), C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, application.KWHzl())));
        }
        return C33069mpW.copydefault(C35399nuc.LoaderManager.sendBehavioSecData, C56423yEv.EZpvd(C56390yDp.OLrzqt("user", CollectionsKt___CollectionsKt.joinToString$default(application.OLrzqt(), application.AEQbTJ(), null, null, 0, null, null, 62, null))));
    }

    public final CharSequence EZpvd(Application application) {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((Iterable) application.OLrzqt(), 2), application.AEQbTJ(), null, null, 0, null, null, 62, null);
        String strEZpvd = C33070mpX.EZpvd(application.valueOf() ? C35399nuc.Fragment.values : C35399nuc.Fragment.fetchVPNInfo, application.copydefault());
        Pair[] pairArr = new Pair[3];
        String strEZpvd2 = application.EZpvd();
        if (strEZpvd2 == null) {
            strEZpvd2 = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("admin", strEZpvd2);
        pairArr[1] = C56390yDp.OLrzqt("user", strJoinToString$default);
        pairArr[2] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, application.KWHzl());
        return C33069mpW.OLrzqt(strEZpvd, C56424yEw.gEmmrt(pairArr));
    }

    public final CharSequence AEQbTJ(Application application) {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(application.OLrzqt(), application.AEQbTJ(), null, null, 0, null, null, 62, null);
        int i = application.valueOf() ? C35399nuc.LoaderManager.UlJrfe : C35399nuc.LoaderManager.RdAHlO;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("user", strJoinToString$default);
        String strEZpvd = application.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("user1", strEZpvd);
        pairArr[2] = C56390yDp.OLrzqt("user2", strJoinToString$default);
        return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
    }
}

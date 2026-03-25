package com.okinc.im.usecase;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.DisbandGroupMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.UpdateGroupMemberMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C35341ntW;
import o.C35863oGm;
import o.C37683oyU;
import o.C44457sQn;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.oBF;
import o.oCI;
import o.oDG;
import o.oGM;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveKeyboardInputStateUseCase {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final oGM AEQbTJ;
    public final oCI EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final oDG OLrzqt;
    public final C35863oGm gEmmrt;

    @yCM
    public ObserveKeyboardInputStateUseCase(@NotNull oGM ogm, @NotNull C35863oGm c35863oGm, @NotNull oDG odg, @NotNull oCI oci, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ogm, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(odg, "");
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = ogm;
        this.gEmmrt = c35863oGm;
        this.OLrzqt = odg;
        this.EZpvd = oci;
        this.KWHzl = coroutineDispatcher;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.usecase.ObserveKeyboardInputStateUseCase.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KeyboardInputState implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ KeyboardInputState[] $VALUES;
        public static final Parcelable.Creator<KeyboardInputState> CREATOR;
        public static final KeyboardInputState AllowInput = new KeyboardInputState("AllowInput", 0);
        public static final KeyboardInputState GroupMuted = new KeyboardInputState("GroupMuted", 1);
        public static final KeyboardInputState BeingKicked = new KeyboardInputState("BeingKicked", 2);
        public static final KeyboardInputState GroupDisbanded = new KeyboardInputState("GroupDisbanded", 3);
        public static final KeyboardInputState Blocked = new KeyboardInputState("Blocked", 4);
        public static final KeyboardInputState KeyboardNotShow = new KeyboardInputState("KeyboardNotShow", 5);
        public static final KeyboardInputState Unknown = new KeyboardInputState("Unknown", 6);

        public static final class Creator implements Parcelable.Creator<KeyboardInputState> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KeyboardInputState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return KeyboardInputState.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KeyboardInputState[] newArray(int i) {
                return new KeyboardInputState[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ KeyboardInputState[] $values() {
            return new KeyboardInputState[]{AllowInput, GroupMuted, BeingKicked, GroupDisbanded, Blocked, KeyboardNotShow, Unknown};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<KeyboardInputState> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private KeyboardInputState(String str, int i) {
        }

        static {
            KeyboardInputState[] keyboardInputStateArr$values = $values();
            $VALUES = keyboardInputStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(keyboardInputStateArr$values);
            CREATOR = new Creator();
        }

        public static KeyboardInputState valueOf(String str) {
            return (KeyboardInputState) Enum.valueOf(KeyboardInputState.class, str);
        }

        public static KeyboardInputState[] values() {
            return (KeyboardInputState[]) $VALUES.clone();
        }
    }

    public final KeyboardInputState EZpvd(OKConversation oKConversation, RelationInfo relationInfo, GroupInfo groupInfo) {
        UpdateGroupMemberMessage updateGroupMemberMessage;
        GroupSystemMessageInfo notifyInfo;
        List<String> targetUserIds;
        C44457sQn c44457sQnEZpvd;
        String strAEQbTJ = this.AEQbTJ.AEQbTJ();
        Boolean boolValueOf = (groupInfo == null || (c44457sQnEZpvd = C37683oyU.EZpvd(groupInfo)) == null) ? null : Boolean.valueOf(c44457sQnEZpvd.OLrzqt());
        OKMessageContent latestMessage = oKConversation != null ? oKConversation.getLatestMessage() : null;
        if (oKConversation == null) {
            return KeyboardInputState.Unknown;
        }
        C35341ntW c35341ntW = C35341ntW.EZpvd;
        if (c35341ntW.KWHzl(oKConversation) && relationInfo != null && Intrinsics.EZpvd(relationInfo.isAllowSendMessage(), Boolean.FALSE)) {
            pUU.KWHzl("ObserveKeyboardInputStateUseCase", "BuildKeyboardInputState, isAllowSendMessage=" + relationInfo.isAllowSendMessage());
            return KeyboardInputState.KeyboardNotShow;
        }
        if (oKConversation.getConversationType() == OKConversationType.PRIVATE && relationInfo != null && oBF.OLrzqt.KWHzl(oKConversation, relationInfo)) {
            return KeyboardInputState.Blocked;
        }
        if (!c35341ntW.OLrzqt(oKConversation) || groupInfo == null || groupInfo.isAllowSendMessageKyc()) {
            return (!(latestMessage instanceof UpdateGroupMemberMessage) || (notifyInfo = (updateGroupMemberMessage = (UpdateGroupMemberMessage) latestMessage).getNotifyInfo()) == null || (targetUserIds = notifyInfo.getTargetUserIds()) == null || !CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) targetUserIds), strAEQbTJ) || updateGroupMemberMessage.isAddMember()) ? latestMessage instanceof DisbandGroupMessage ? KeyboardInputState.GroupDisbanded : (groupInfo != null && groupInfo.isMute() && Intrinsics.EZpvd(boolValueOf, Boolean.FALSE)) ? KeyboardInputState.GroupMuted : KeyboardInputState.AllowInput : KeyboardInputState.BeingKicked;
        }
        return KeyboardInputState.KeyboardNotShow;
    }

    public final Flow<KeyboardInputState> EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.flow(new ObserveKeyboardInputStateUseCase$execute$1(str, this.EZpvd.KWHzl(str), this.gEmmrt.EZpvd(str), this.OLrzqt.AEQbTJ(str), this, null)), this.KWHzl);
    }
}

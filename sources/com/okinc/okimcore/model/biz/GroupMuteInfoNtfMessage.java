package com.okinc.okimcore.model.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import o.C33489mxS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class GroupMuteInfoNtfMessage extends AbsOKInformationNotificationMessage<GroupMuteInfo> {
    public static final Activity Companion = new Activity(null);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.biz.GroupMuteInfoNtfMessage.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // com.okinc.okimcore.model.biz.AbsOKInformationNotificationMessage
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public GroupMuteInfo KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (GroupMuteInfo) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) GroupMuteInfo.Companion.serializer(), str);
    }
}

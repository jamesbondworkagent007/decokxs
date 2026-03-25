package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta;
import com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta$$serializer;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33070mpX;
import o.C33129mqd;
import o.C44157sFk;
import o.C44526sTc;
import o.sDX;
import o.sDZ;
import o.sFU;
import o.sSQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public class OKTextMessage extends OKMessageContent {
    private static final KSerializer<Object>[] $childSerializers;

    @SerializedName("content")
    private String content;
    private List<String> longTextList;
    private SiteMeta siteMeta;
    private List<String> urlList;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getLongTextList() {
        return this.longTextList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SiteMeta getSiteMeta() {
        return this.siteMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getUrlList() {
        return this.urlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongTextList(List<String> list) {
        this.longTextList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSiteMeta(SiteMeta siteMeta) {
        this.siteMeta = siteMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public /* synthetic */ OKTextMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, List list, List list2, SiteMeta siteMeta, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        if ((i & 512) == 0) {
            this.urlList = null;
        } else {
            this.urlList = list;
        }
        if ((i & 1024) == 0) {
            this.longTextList = null;
        } else {
            this.longTextList = list2;
        }
        if ((i & 2048) == 0) {
            this.siteMeta = null;
        } else {
            this.siteMeta = siteMeta;
        }
    }

    public static final /* synthetic */ void write$Self(OKTextMessage oKTextMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKTextMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKTextMessage.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oKTextMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKTextMessage.urlList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], oKTextMessage.urlList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKTextMessage.longTextList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], oKTextMessage.longTextList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && oKTextMessage.siteMeta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, SiteMeta$$serializer.INSTANCE, oKTextMessage.siteMeta);
    }

    public final String getAliasedContent() {
        String strReplaceFirst;
        List<MentionedUserInfo> mentionedUserList;
        String string;
        RelationInfo relationInfoKWHzl;
        String displayName$default;
        OKMentionedInfo mentionedInfo = getMentionedInfo();
        String str = null;
        if ((mentionedInfo != null ? mentionedInfo.getType() : null) != OKMentionedInfo.MentionedType.ALL) {
            strReplaceFirst = this.content;
        } else {
            Regex regex = new Regex("@all\\s");
            String str2 = this.content;
            strReplaceFirst = str2 != null ? regex.replaceFirst(str2, "@" + C33070mpX.AYXKKw(sDX.StateListAnimator.AkhnZx) + " ") : null;
        }
        OKMentionedInfo mentionedInfo2 = getMentionedInfo();
        if (mentionedInfo2 == null || (mentionedUserList = mentionedInfo2.getMentionedUserList()) == null) {
            return strReplaceFirst;
        }
        if (!(!mentionedUserList.isEmpty())) {
            mentionedUserList = null;
        }
        if (mentionedUserList == null) {
            return strReplaceFirst;
        }
        if (strReplaceFirst != null) {
            sFU sfuValueOf = sDZ.AEQbTJ.valueOf();
            StringBuilder sb = new StringBuilder();
            int length = 0;
            for (MentionedUserInfo mentionedUserInfo : mentionedUserList) {
                String atUserName = mentionedUserInfo.getAtUserName();
                if (atUserName != null && (relationInfoKWHzl = sfuValueOf.KWHzl(mentionedUserInfo.getUserId())) != null && (displayName$default = C44157sFk.getDisplayName$default(relationInfoKWHzl, str, 1, str)) != null) {
                    String str3 = C33129mqd.OLrzqt((CharSequence) displayName$default) ? displayName$default : str;
                    if (str3 != null) {
                        String str4 = str3;
                        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strReplaceFirst, atUserName, length, false, 4, (Object) null);
                        if (iIndexOf$default >= 0) {
                            String strSubstring = strReplaceFirst.substring(length, iIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            sb.append(strSubstring);
                            sb.append("@" + str4);
                            length = iIndexOf$default + atUserName.length();
                        }
                    }
                }
                str = null;
            }
            String strSubstring2 = strReplaceFirst.substring(length);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            sb.append(strSubstring2);
            string = sb.toString();
        } else {
            string = null;
        }
        return string == null ? strReplaceFirst : string;
    }

    public final String getLanguageNicknameContent() {
        String strReplaceFirst;
        List<MentionedUserInfo> mentionedUserList;
        String string;
        RelationInfo relationInfoKWHzl;
        String strCopydefault;
        OKMentionedInfo mentionedInfo = getMentionedInfo();
        if ((mentionedInfo != null ? mentionedInfo.getType() : null) != OKMentionedInfo.MentionedType.ALL) {
            strReplaceFirst = this.content;
        } else {
            Regex regex = new Regex("@all\\s");
            String str = this.content;
            strReplaceFirst = str != null ? regex.replaceFirst(str, "@" + C33070mpX.AYXKKw(sDX.StateListAnimator.AkhnZx) + " ") : null;
        }
        OKMentionedInfo mentionedInfo2 = getMentionedInfo();
        if (mentionedInfo2 == null || (mentionedUserList = mentionedInfo2.getMentionedUserList()) == null) {
            return strReplaceFirst;
        }
        if (!(!mentionedUserList.isEmpty())) {
            mentionedUserList = null;
        }
        if (mentionedUserList == null) {
            return strReplaceFirst;
        }
        if (strReplaceFirst != null) {
            sFU sfuValueOf = sDZ.AEQbTJ.valueOf();
            StringBuilder sb = new StringBuilder();
            int length = 0;
            for (MentionedUserInfo mentionedUserInfo : mentionedUserList) {
                String atUserName = mentionedUserInfo.getAtUserName();
                if (atUserName != null && (relationInfoKWHzl = sfuValueOf.KWHzl(mentionedUserInfo.getUserId())) != null && (strCopydefault = C44157sFk.copydefault(relationInfoKWHzl)) != null) {
                    String str2 = C33129mqd.OLrzqt((CharSequence) strCopydefault) ? strCopydefault : null;
                    if (str2 != null) {
                        String str3 = str2;
                        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strReplaceFirst, atUserName, length, false, 4, (Object) null);
                        if (iIndexOf$default >= 0) {
                            String strSubstring = strReplaceFirst.substring(length, iIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            sb.append(strSubstring);
                            sb.append("@" + str3);
                            length = iIndexOf$default + atUserName.length();
                        }
                    }
                }
            }
            String strSubstring2 = strReplaceFirst.substring(length);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            sb.append(strSubstring2);
            string = sb.toString();
        } else {
            string = null;
        }
        return string == null ? strReplaceFirst : string;
    }

    public OKTextMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKTextMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.content = parcel.readString();
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.content);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKTextMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKTextMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKTextMessage> serializer() {
            return OKTextMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKTextMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKTextMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKTextMessage[] newArray(int i) {
            return new OKTextMessage[i];
        }

        public final OKTextMessage obtain(String str) {
            OKTextMessage oKTextMessage = new OKTextMessage();
            oKTextMessage.setContent(str);
            return oKTextMessage;
        }

        public static /* synthetic */ OKTextMessage obtainSendMessage$default(CREATOR creator, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return creator.obtainSendMessage(str, z);
        }

        public final OKTextMessage obtainSendMessage(String str, boolean z) {
            OKTextMessage oKTextMessage = new OKTextMessage();
            oKTextMessage.setContent(str);
            if (!z) {
                oKTextMessage.setUrlList(C44526sTc.OLrzqt.KWHzl(str == null ? "" : str));
                sSQ ssq = sSQ.KWHzl;
                if (str == null) {
                    str = "";
                }
                oKTextMessage.setLongTextList(ssq.djBIcL(str));
            }
            return oKTextMessage;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null};
    }
}

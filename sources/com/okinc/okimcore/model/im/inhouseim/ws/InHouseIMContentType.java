package com.okinc.okimcore.model.im.inhouseim.ws;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sPN;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sPN.class)
public final class InHouseIMContentType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InHouseIMContentType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int apiValue;
    public static final InHouseIMContentType Unknown = new InHouseIMContentType("Unknown", 0, 0);
    public static final InHouseIMContentType Text = new InHouseIMContentType("Text", 1, 101);
    public static final InHouseIMContentType Image = new InHouseIMContentType(UDImageInfo.LUA_CLASS_NAME, 2, 102);
    public static final InHouseIMContentType Voice = new InHouseIMContentType("Voice", 3, 103);
    public static final InHouseIMContentType VoiceCall = new InHouseIMContentType("VoiceCall", 4, 104);
    public static final InHouseIMContentType Quote = new InHouseIMContentType("Quote", 5, 105);
    public static final InHouseIMContentType Custom = new InHouseIMContentType(TypedValues.Custom.NAME, 6, 106);
    public static final InHouseIMContentType ReadReceipt = new InHouseIMContentType("ReadReceipt", 7, 107);
    public static final InHouseIMContentType RecallMessageBySender = new InHouseIMContentType("RecallMessageBySender", 8, 108);
    public static final InHouseIMContentType RecallMessageByAdmin = new InHouseIMContentType("RecallMessageByAdmin", 9, 109);
    public static final InHouseIMContentType RecallMessageBySenderServer = new InHouseIMContentType("RecallMessageBySenderServer", 10, WalletImportError.ERROR_CODE_AA_CREATE_KEY);
    public static final InHouseIMContentType RecallMessageByAdminServer = new InHouseIMContentType("RecallMessageByAdminServer", 11, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY);
    public static final InHouseIMContentType Video = new InHouseIMContentType("Video", 12, WalletImportError.ERROR_CODE_AA_EXIST);
    public static final InHouseIMContentType Media = new InHouseIMContentType("Media", 13, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST);
    public static final InHouseIMContentType GroupInvitation = new InHouseIMContentType("GroupInvitation", 14, 114);
    public static final InHouseIMContentType STICKER = new InHouseIMContentType("STICKER", 15, 117);
    public static final InHouseIMContentType Share = new InHouseIMContentType("Share", 16, 120);
    public static final InHouseIMContentType StreamPlaceHolder = new InHouseIMContentType("StreamPlaceHolder", 17, 121);
    public static final InHouseIMContentType Stream = new InHouseIMContentType("Stream", 18, 122);
    public static final InHouseIMContentType TypingIndicator = new InHouseIMContentType("TypingIndicator", 19, 130);
    public static final InHouseIMContentType SystemMessage = new InHouseIMContentType("SystemMessage", 20, 200);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InHouseIMContentType[] $values() {
        return new InHouseIMContentType[]{Unknown, Text, Image, Voice, VoiceCall, Quote, Custom, ReadReceipt, RecallMessageBySender, RecallMessageByAdmin, RecallMessageBySenderServer, RecallMessageByAdminServer, Video, Media, GroupInvitation, STICKER, Share, StreamPlaceHolder, Stream, TypingIndicator, SystemMessage};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InHouseIMContentType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiValue() {
        return this.apiValue;
    }

    private InHouseIMContentType(String str, int i, int i2) {
        this.apiValue = i2;
    }

    static {
        InHouseIMContentType[] inHouseIMContentTypeArr$values = $values();
        $VALUES = inHouseIMContentTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inHouseIMContentTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InHouseIMContentType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) InHouseIMContentType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InHouseIMContentType> serializer() {
            return AEQbTJ();
        }

        public final InHouseIMContentType AEQbTJ(Integer num) {
            InHouseIMContentType next;
            if (num == null) {
                return InHouseIMContentType.Unknown;
            }
            Iterator<InHouseIMContentType> it = InHouseIMContentType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getApiValue() == num.intValue()) {
                    break;
                }
            }
            InHouseIMContentType inHouseIMContentType = next;
            return inHouseIMContentType == null ? InHouseIMContentType.Unknown : inHouseIMContentType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sPN();
    }

    public static InHouseIMContentType valueOf(String str) {
        return (InHouseIMContentType) Enum.valueOf(InHouseIMContentType.class, str);
    }

    public static InHouseIMContentType[] values() {
        return (InHouseIMContentType[]) $VALUES.clone();
    }
}

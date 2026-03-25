package com.okinc.ok_kyc_core.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes19.dex */
public final class Constant {
    public static final Constant copydefault = new Constant();

    private Constant() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class UploadFileType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ UploadFileType[] $VALUES;
        private final int imageTypeVal;
        public static final UploadFileType PASSPORT = new UploadFileType("PASSPORT", 0, 1);
        public static final UploadFileType ID_FRONT = new UploadFileType("ID_FRONT", 1, 2);
        public static final UploadFileType ID_BACK = new UploadFileType("ID_BACK", 2, 3);
        public static final UploadFileType ID_SINGLE_DOCUMENT = new UploadFileType("ID_SINGLE_DOCUMENT", 3, 4);
        public static final UploadFileType LIVE_FACE = new UploadFileType("LIVE_FACE", 4, 26);
        public static final UploadFileType NFC_IMAGE = new UploadFileType("NFC_IMAGE", 5, 35);
        public static final UploadFileType LIVE_FACE_AWS = new UploadFileType("LIVE_FACE_AWS", 6, 9999);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ UploadFileType[] $values() {
            return new UploadFileType[]{PASSPORT, ID_FRONT, ID_BACK, ID_SINGLE_DOCUMENT, LIVE_FACE, NFC_IMAGE, LIVE_FACE_AWS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<UploadFileType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getImageTypeVal() {
            return this.imageTypeVal;
        }

        private UploadFileType(String str, int i, int i2) {
            this.imageTypeVal = i2;
        }

        static {
            UploadFileType[] uploadFileTypeArr$values = $values();
            $VALUES = uploadFileTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(uploadFileTypeArr$values);
        }

        public static UploadFileType valueOf(String str) {
            return (UploadFileType) Enum.valueOf(UploadFileType.class, str);
        }

        public static UploadFileType[] values() {
            return (UploadFileType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class VendorType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ VendorType[] $VALUES;
        private final int vendorType;
        public static final VendorType JUMIO = new VendorType("JUMIO", 0, 1);
        public static final VendorType SUMSUB = new VendorType("SUMSUB", 1, 5);
        public static final VendorType SINGPASS = new VendorType("SINGPASS", 2, 7);
        public static final VendorType SINGCAT = new VendorType("SINGCAT", 3, 8);
        public static final VendorType EOP = new VendorType("EOP", 4, 99);
        public static final VendorType AMANI = new VendorType("AMANI", 5, 10);
        public static final VendorType AMANI_VIDEO_CALL = new VendorType("AMANI_VIDEO_CALL", 6, 1000);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ VendorType[] $values() {
            return new VendorType[]{JUMIO, SUMSUB, SINGPASS, SINGCAT, EOP, AMANI, AMANI_VIDEO_CALL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<VendorType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getVendorType() {
            return this.vendorType;
        }

        private VendorType(String str, int i, int i2) {
            this.vendorType = i2;
        }

        static {
            VendorType[] vendorTypeArr$values = $values();
            $VALUES = vendorTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(vendorTypeArr$values);
        }

        public static VendorType valueOf(String str) {
            return (VendorType) Enum.valueOf(VendorType.class, str);
        }

        public static VendorType[] values() {
            return (VendorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class CardVendorType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CardVendorType[] $VALUES;
        public static final CardVendorType DEFAULT = new CardVendorType("DEFAULT", 0, "default");
        public static final CardVendorType JUMIO = new CardVendorType("JUMIO", 1, "jumio");
        private final String cardVendorType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CardVendorType[] $values() {
            return new CardVendorType[]{DEFAULT, JUMIO};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CardVendorType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCardVendorType() {
            return this.cardVendorType;
        }

        private CardVendorType(String str, int i, String str2) {
            this.cardVendorType = str2;
        }

        static {
            CardVendorType[] cardVendorTypeArr$values = $values();
            $VALUES = cardVendorTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(cardVendorTypeArr$values);
        }

        public static CardVendorType valueOf(String str) {
            return (CardVendorType) Enum.valueOf(CardVendorType.class, str);
        }

        public static CardVendorType[] values() {
            return (CardVendorType[]) $VALUES.clone();
        }
    }
}

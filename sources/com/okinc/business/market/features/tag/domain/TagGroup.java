package com.okinc.business.market.features.tag.domain;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TagGroup {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TagGroup[] $VALUES;
    public static final Application Companion;
    private final int grpValue;
    private final Integer resourceKey;
    public static final TagGroup NONE = new TagGroup("NONE", 0, -1, null);
    public static final TagGroup INFO = new TagGroup("INFO", 1, 0, Integer.valueOf(C23274hvD.Fragment.svY));
    public static final TagGroup COMMUNITY = new TagGroup("COMMUNITY", 2, 1, Integer.valueOf(C23274hvD.Fragment.bindToGooglePlayService));
    public static final TagGroup DATA = new TagGroup("DATA", 3, 2, Integer.valueOf(C23274hvD.Fragment.DcMfJKDDUqPf));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TagGroup[] $values() {
        return new TagGroup[]{NONE, INFO, COMMUNITY, DATA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TagGroup> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGrpValue() {
        return this.grpValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResourceKey() {
        return this.resourceKey;
    }

    private TagGroup(String str, @StringRes int i, int i2, Integer num) {
        this.grpValue = i2;
        this.resourceKey = num;
    }

    static {
        TagGroup[] tagGroupArr$values = $values();
        $VALUES = tagGroupArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tagGroupArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.tag.domain.TagGroup.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final TagGroup OLrzqt(int i) {
            TagGroup tagGroup = TagGroup.INFO;
            if (i == tagGroup.getGrpValue()) {
                return tagGroup;
            }
            TagGroup tagGroup2 = TagGroup.COMMUNITY;
            if (i == tagGroup2.getGrpValue()) {
                return tagGroup2;
            }
            TagGroup tagGroup3 = TagGroup.DATA;
            return i == tagGroup3.getGrpValue() ? tagGroup3 : TagGroup.NONE;
        }
    }

    public static TagGroup valueOf(String str) {
        return (TagGroup) Enum.valueOf(TagGroup.class, str);
    }

    public static TagGroup[] values() {
        return (TagGroup[]) $VALUES.clone();
    }
}

package uniffi.user;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AvatarType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AvatarType[] $VALUES;
    public static final AvatarType PREDEFINED = new AvatarType("PREDEFINED", 0);
    public static final AvatarType UPLOADED = new AvatarType("UPLOADED", 1);
    public static final AvatarType UNKNOWN = new AvatarType("UNKNOWN", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AvatarType[] $values() {
        return new AvatarType[]{PREDEFINED, UPLOADED, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AvatarType> getEntries() {
        return $ENTRIES;
    }

    private AvatarType(String str, int i) {
    }

    static {
        AvatarType[] avatarTypeArr$values = $values();
        $VALUES = avatarTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(avatarTypeArr$values);
    }

    public static AvatarType valueOf(String str) {
        return (AvatarType) Enum.valueOf(AvatarType.class, str);
    }

    public static AvatarType[] values() {
        return (AvatarType[]) $VALUES.clone();
    }
}

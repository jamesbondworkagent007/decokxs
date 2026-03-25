package com.okinc.ok_kyc_core.common;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C43246rlf;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageTypeDetector {
    public final List<Activity> copydefault = yDY.gEmmrt(KWHzl(), AEQbTJ());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ImageType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ImageType[] $VALUES;
        public static final ImageType JPEG = new ImageType("JPEG", 0, "jpeg");
        public static final ImageType PNG = new ImageType("PNG", 1, "png");
        private final String typeName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ImageType[] $values() {
            return new ImageType[]{JPEG, PNG};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ImageType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTypeName() {
            return this.typeName;
        }

        private ImageType(String str, int i, String str2) {
            this.typeName = str2;
        }

        static {
            ImageType[] imageTypeArr$values = $values();
            $VALUES = imageTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(imageTypeArr$values);
        }

        public static ImageType valueOf(String str) {
            return (ImageType) Enum.valueOf(ImageType.class, str);
        }

        public static ImageType[] values() {
            return (ImageType[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final ImageType KWHzl(@NotNull Uri uri) {
        InputStream inputStreamOpenInputStream;
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            inputStreamOpenInputStream = C43246rlf.OLrzqt.valueOf().getContentResolver().openInputStream(uri);
            try {
            } finally {
            }
        } catch (Exception unused) {
        }
        if (inputStreamOpenInputStream != null) {
            Iterator<T> it = this.copydefault.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int iKWHzl = ((Activity) it.next()).KWHzl();
            while (it.hasNext()) {
                int iKWHzl2 = ((Activity) it.next()).KWHzl();
                if (iKWHzl < iKWHzl2) {
                    iKWHzl = iKWHzl2;
                }
            }
            byte[] bArr = new byte[iKWHzl];
            inputStreamOpenInputStream.read(bArr);
            for (Activity activity : this.copydefault) {
                if (activity.copydefault(bArr)) {
                    ImageType imageTypeOLrzqt = activity.OLrzqt();
                    yFA.copydefault(inputStreamOpenInputStream, null);
                    return imageTypeOLrzqt;
                }
            }
            ImageType imageType = ImageType.PNG;
            yFA.copydefault(inputStreamOpenInputStream, null);
            return imageType;
        }
        Unit unit = Unit.INSTANCE;
        yFA.copydefault(inputStreamOpenInputStream, null);
        return ImageType.PNG;
    }

    public static final class Activity {
        public final byte[] AEQbTJ;
        public final ImageType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageType OLrzqt() {
            return this.copydefault;
        }

        public Activity(@NotNull byte[] bArr, @NotNull ImageType imageType) {
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(imageType, "");
            this.AEQbTJ = bArr;
            this.copydefault = imageType;
        }

        public final int KWHzl() {
            return this.AEQbTJ.length;
        }

        public final boolean copydefault(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            if (KWHzl() > bArr.length) {
                return false;
            }
            int length = this.AEQbTJ.length;
            for (int i = 0; i < length; i++) {
                if (this.AEQbTJ[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public final Activity KWHzl() {
        return new Activity(new byte[]{-1, -40, -1}, ImageType.JPEG);
    }

    public final Activity AEQbTJ() {
        return new Activity(new byte[]{-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10}, ImageType.PNG);
    }
}

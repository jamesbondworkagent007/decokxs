package com.okinc.planet.utils;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import o.C43246rlf;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ImageTypeDetector {
    public final List<Application> KWHzl = yDY.gEmmrt(copydefault(), AEQbTJ());

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
    public final ImageType EZpvd(@NotNull Uri uri) {
        Object next;
        ImageType imageTypeCopydefault;
        Intrinsics.checkNotNullParameter(uri, "");
        try {
            InputStream inputStreamOpenInputStream = C43246rlf.OLrzqt.valueOf().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    Iterator<T> it = this.KWHzl.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int iAEQbTJ = ((Application) it.next()).AEQbTJ();
                    while (it.hasNext()) {
                        int iAEQbTJ2 = ((Application) it.next()).AEQbTJ();
                        if (iAEQbTJ < iAEQbTJ2) {
                            iAEQbTJ = iAEQbTJ2;
                        }
                    }
                    byte[] bArr = new byte[iAEQbTJ];
                    if (inputStreamOpenInputStream.read(bArr) <= 0) {
                        imageTypeCopydefault = ImageType.PNG;
                    } else {
                        Iterator<T> it2 = this.KWHzl.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (((Application) next).AEQbTJ(bArr)) {
                                break;
                            }
                        }
                        Application application = (Application) next;
                        if (application == null || (imageTypeCopydefault = application.copydefault()) == null) {
                            imageTypeCopydefault = ImageType.PNG;
                        }
                    }
                    yFA.copydefault(inputStreamOpenInputStream, null);
                    if (imageTypeCopydefault != null) {
                        return imageTypeCopydefault;
                    }
                } finally {
                }
            }
            return ImageType.PNG;
        } catch (Exception unused) {
            return ImageType.PNG;
        }
    }

    public static final class Application {
        public final byte[] AEQbTJ;
        public final ImageType EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageType copydefault() {
            return this.EZpvd;
        }

        public Application(@NotNull byte[] bArr, @NotNull ImageType imageType) {
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(imageType, "");
            this.AEQbTJ = bArr;
            this.EZpvd = imageType;
        }

        public final int AEQbTJ() {
            return this.AEQbTJ.length;
        }

        public final boolean AEQbTJ(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            if (AEQbTJ() > bArr.length) {
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

    public final Application copydefault() {
        return new Application(new byte[]{-1, -40, -1}, ImageType.JPEG);
    }

    public final Application AEQbTJ() {
        return new Application(new byte[]{-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10}, ImageType.PNG);
    }
}

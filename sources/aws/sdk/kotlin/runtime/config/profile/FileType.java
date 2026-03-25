package aws.sdk.kotlin.runtime.config.profile;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56444yFp;
import o.C59333zf;
import o.C59492zi;
import o.HL;
import o.IOException;
import o.InterfaceC56445yFq;
import o.ObjectStreamException;
import o.PipedInputStream;
import o.PutField;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class FileType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FileType[] $VALUES;
    public static final FileType CONFIGURATION;
    public static final FileType CREDENTIAL;
    private final List<yHO<PutField, PipedInputStream.TaskDescription, PipedInputStream.StateListAnimator, PipedInputStream>> lineParsers;
    private final List<String> pathSegments;
    private final C59492zi<String> setting;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FileType[] $values() {
        return new FileType[]{CONFIGURATION, CREDENTIAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FileType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static FileType valueOf(String str) {
        return (FileType) Enum.valueOf(FileType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static FileType[] values() {
        return (FileType[]) $VALUES.clone();
    }

    private FileType(String str, int i, C59492zi c59492zi, List list, List list2) {
        this.setting = c59492zi;
        this.lineParsers = list;
        this.pathSegments = list2;
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.config.profile.FileType$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yHO<PutField, PipedInputStream.TaskDescription, PipedInputStream.StateListAnimator, PipedInputStream.TaskDescription> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1() {
            super(3, ObjectStreamException.class, "configurationSection", "configurationSection(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Section;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final PipedInputStream.TaskDescription invoke(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(putField, "");
            return ObjectStreamException.OLrzqt(putField, taskDescription, stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.config.profile.FileType$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements yHO<PutField, PipedInputStream.TaskDescription, PipedInputStream.StateListAnimator, PipedInputStream.StateListAnimator> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2() {
            super(3, ObjectStreamException.class, "property", "property(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Property;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final PipedInputStream.StateListAnimator invoke(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(putField, "");
            return ObjectStreamException.AEQbTJ(putField, taskDescription, stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.config.profile.FileType$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements yHO<PutField, PipedInputStream.TaskDescription, PipedInputStream.StateListAnimator, PipedInputStream.ActionBar> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3() {
            super(3, ObjectStreamException.class, "continuation", "continuation(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Continuation;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final PipedInputStream.ActionBar invoke(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(putField, "");
            return ObjectStreamException.EZpvd(putField, taskDescription, stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.config.profile.FileType$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements yHO<PutField, PipedInputStream.TaskDescription, PipedInputStream.StateListAnimator, PipedInputStream.Activity> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4() {
            super(3, ObjectStreamException.class, "subProperty", "subProperty(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$SubProperty;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final PipedInputStream.Activity invoke(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(putField, "");
            return ObjectStreamException.copydefault(putField, taskDescription, stateListAnimator);
        }
    }

    static {
        IOException iOException = IOException.zsXlph;
        CONFIGURATION = new FileType("CONFIGURATION", 0, iOException.AEQbTJ(), yDY.gEmmrt(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE, AnonymousClass4.INSTANCE), yDY.gEmmrt("~", ".aws", "config"));
        CREDENTIAL = new FileType("CREDENTIAL", 1, iOException.uzCIH(), yDY.gEmmrt(AnonymousClass5.INSTANCE, AnonymousClass6.INSTANCE, AnonymousClass7.INSTANCE, AnonymousClass8.INSTANCE), yDY.gEmmrt("~", ".aws", "credentials"));
        FileType[] fileTypeArr$values = $values();
        $VALUES = fileTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fileTypeArr$values);
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.config.profile.FileType$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements yHO<PutField, PipedInputStream.TaskDescription, PipedInputStream.StateListAnimator, PipedInputStream.TaskDescription> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5() {
            super(3, ObjectStreamException.class, "credentialProfile", "credentialProfile(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Section;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final PipedInputStream.TaskDescription invoke(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(putField, "");
            return ObjectStreamException.KWHzl(putField, taskDescription, stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.config.profile.FileType$6, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements yHO<PutField, PipedInputStream.TaskDescription, PipedInputStream.StateListAnimator, PipedInputStream.StateListAnimator> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6() {
            super(3, ObjectStreamException.class, "property", "property(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Property;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final PipedInputStream.StateListAnimator invoke(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(putField, "");
            return ObjectStreamException.AEQbTJ(putField, taskDescription, stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.config.profile.FileType$7, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements yHO<PutField, PipedInputStream.TaskDescription, PipedInputStream.StateListAnimator, PipedInputStream.ActionBar> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass7() {
            super(3, ObjectStreamException.class, "continuation", "continuation(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Continuation;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final PipedInputStream.ActionBar invoke(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(putField, "");
            return ObjectStreamException.EZpvd(putField, taskDescription, stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.config.profile.FileType$8, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements yHO<PutField, PipedInputStream.TaskDescription, PipedInputStream.StateListAnimator, PipedInputStream.Activity> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass8() {
            super(3, ObjectStreamException.class, "subProperty", "subProperty(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$SubProperty;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final PipedInputStream.Activity invoke(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(putField, "");
            return ObjectStreamException.copydefault(putField, taskDescription, stateListAnimator);
        }
    }

    public final String path(@NotNull HL hl) {
        String string;
        Intrinsics.checkNotNullParameter(hl, "");
        String str = (String) C59333zf.AEQbTJ(this.setting, hl);
        return (str == null || (string = StringsKt__StringsKt.hDKMBd((CharSequence) str).toString()) == null) ? CollectionsKt___CollectionsKt.joinToString$default(this.pathSegments, hl.KWHzl(), null, null, 0, null, null, 62, null) : string;
    }

    public final PipedInputStream tokenOf(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
        PipedInputStream pipedInputStream;
        Intrinsics.checkNotNullParameter(putField, "");
        Iterator<T> it = this.lineParsers.iterator();
        while (true) {
            if (!it.hasNext()) {
                pipedInputStream = null;
                break;
            }
            pipedInputStream = (PipedInputStream) ((yHO) it.next()).invoke(putField, taskDescription, stateListAnimator);
            if (pipedInputStream != null) {
                break;
            }
        }
        if (pipedInputStream != null) {
            return pipedInputStream;
        }
        throw new AwsConfigParseException("Encountered unexpected token", putField.OLrzqt());
    }
}

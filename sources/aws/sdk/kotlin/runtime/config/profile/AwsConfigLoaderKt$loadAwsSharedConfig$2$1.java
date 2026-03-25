package aws.sdk.kotlin.runtime.config.profile;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.HL;
import o.InterfaceC5148Go;
import o.NotActiveException;
import o.ObjectInput;
import o.ObjectOutput;
import o.ObjectOutputStream;
import o.ObjectStreamField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AwsConfigLoaderKt$loadAwsSharedConfig$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ObjectOutputStream>, Object> {
    final /* synthetic */ InterfaceC5148Go $logger;
    final /* synthetic */ HL $platform;
    final /* synthetic */ ObjectOutput $source;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwsConfigLoaderKt$loadAwsSharedConfig$2$1(InterfaceC5148Go interfaceC5148Go, HL hl, ObjectOutput objectOutput, Continuation<? super AwsConfigLoaderKt$loadAwsSharedConfig$2$1> continuation) {
        super(2, continuation);
        this.$logger = interfaceC5148Go;
        this.$platform = hl;
        this.$source = objectOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new AwsConfigLoaderKt$loadAwsSharedConfig$2$1(this.$logger, this.$platform, this.$source, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super ObjectOutputStream> continuation) {
        return ((AwsConfigLoaderKt$loadAwsSharedConfig$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Map[] mapArr;
        InterfaceC5148Go interfaceC5148Go;
        FileType fileType;
        int i;
        Map[] mapArr2;
        InterfaceC5148Go interfaceC5148Go2;
        FileType fileType2;
        Map[] mapArr3;
        Map[] mapArr4;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mapArr = new Map[2];
            interfaceC5148Go = this.$logger;
            fileType = FileType.CONFIGURATION;
            HL hl = this.$platform;
            String strCopydefault = this.$source.copydefault();
            this.L$0 = mapArr;
            this.L$1 = mapArr;
            this.L$2 = interfaceC5148Go;
            this.L$3 = fileType;
            this.I$0 = 0;
            this.label = 1;
            obj = hl.KWHzl(strCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            i = 0;
            mapArr2 = mapArr;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = this.I$0;
                fileType2 = (FileType) this.L$3;
                interfaceC5148Go2 = (InterfaceC5148Go) this.L$2;
                mapArr3 = (Map[]) this.L$1;
                mapArr4 = (Map[]) this.L$0;
                C56391yDq.AEQbTJ(obj);
                byte[] bArr = (byte[]) obj;
                mapArr3[i3] = NotActiveException.OLrzqt(interfaceC5148Go2, fileType2, bArr != null ? C59449zhJ.copydefault(bArr) : null);
                return NotActiveException.AEQbTJ(ObjectInput.KWHzl((Map<ConfigSectionType, ? extends Map<String, ObjectStreamField>>[]) mapArr4), this.$source);
            }
            i = this.I$0;
            fileType = (FileType) this.L$3;
            interfaceC5148Go = (InterfaceC5148Go) this.L$2;
            Map[] mapArr5 = (Map[]) this.L$1;
            Map[] mapArr6 = (Map[]) this.L$0;
            C56391yDq.AEQbTJ(obj);
            mapArr2 = mapArr5;
            mapArr = mapArr6;
        }
        byte[] bArr2 = (byte[]) obj;
        mapArr2[i] = NotActiveException.OLrzqt(interfaceC5148Go, fileType, bArr2 != null ? C59449zhJ.copydefault(bArr2) : null);
        interfaceC5148Go2 = this.$logger;
        FileType fileType3 = FileType.CREDENTIAL;
        HL hl2 = this.$platform;
        String strOLrzqt = this.$source.OLrzqt();
        this.L$0 = mapArr;
        this.L$1 = mapArr;
        this.L$2 = interfaceC5148Go2;
        this.L$3 = fileType3;
        this.I$0 = 1;
        this.label = 2;
        Object objKWHzl = hl2.KWHzl(strOLrzqt, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        fileType2 = fileType3;
        obj = objKWHzl;
        mapArr3 = mapArr;
        mapArr4 = mapArr3;
        byte[] bArr3 = (byte[]) obj;
        mapArr3[i3] = NotActiveException.OLrzqt(interfaceC5148Go2, fileType2, bArr3 != null ? C59449zhJ.copydefault(bArr3) : null);
        return NotActiveException.AEQbTJ(ObjectInput.KWHzl((Map<ConfigSectionType, ? extends Map<String, ObjectStreamField>>[]) mapArr4), this.$source);
    }
}

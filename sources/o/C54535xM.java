package o;

import aws.smithy.kotlin.runtime.awsprotocol.xml.ErrorResponseDeserializer$deserialize$1;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54535xM {
    public static final C5101Et EZpvd;
    public static final C54535xM KWHzl = new C54535xM();
    public static final C5098Eq OLrzqt;
    public static final C5101Et copydefault;

    private C54535xM() {
    }

    static {
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new C5128Fu("Error"));
        copydefault = c5101Et;
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new C5128Fu("RequestId"));
        EZpvd = c5101Et2;
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.KWHzl(new C5128Fu("ErrorResponse"));
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        OLrzqt = activity.KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v9, resolved type: T */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r12 = o.C54617xP.EZpvd;
        r0.L$0 = r11;
        r0.L$1 = r6;
        r0.L$2 = r2;
        r0.L$3 = r5;
        r0.L$4 = r2;
        r0.label = 1;
        r12 = r12.OLrzqt(r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r12 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        r7 = r11;
        r11 = r2;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        r11 = r2.element;
        r12 = (o.C54671xR) r11;
        r0 = (java.lang.String) r6.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        r11 = (o.C54671xR) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        r0 = r11.KWHzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        return new o.C54644xQ(r12, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[Catch: DeserializationException -> 0x00c2, TryCatch #0 {DeserializationException -> 0x00c2, blocks: (B:12:0x003a, B:27:0x0087, B:18:0x005d, B:28:0x008b, B:35:0x00a3, B:36:0x00a7, B:38:0x00b2, B:40:0x00b6, B:42:0x00bc, B:31:0x0094, B:33:0x009a, B:21:0x006a, B:23:0x0070, B:17:0x0056), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7 A[EDGE_INSN: B:49:0x00a7->B:36:0x00a7 BREAK  A[LOOP:0: B:18:0x005d->B:53:0x005d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v8, types: [T, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0085 -> B:27:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull InterfaceC5095En interfaceC5095En, @NotNull Continuation<? super C54644xQ> continuation) throws java.lang.Throwable {
        ErrorResponseDeserializer$deserialize$1 errorResponseDeserializer$deserialize$1;
        Ref.ObjectRef objectRef;
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd;
        Ref.ObjectRef objectRef2;
        java.lang.Integer numOLrzqt;
        if (continuation instanceof ErrorResponseDeserializer$deserialize$1) {
            errorResponseDeserializer$deserialize$1 = (ErrorResponseDeserializer$deserialize$1) continuation;
            int i = errorResponseDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                errorResponseDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                errorResponseDeserializer$deserialize$1 = new ErrorResponseDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = errorResponseDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = errorResponseDeserializer$deserialize$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                stateListAnimatorEZpvd = interfaceC5095En.EZpvd(OLrzqt);
                objectRef2 = objectRef3;
                while (true) {
                    numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
                    int iCopydefault = copydefault.copydefault();
                    if (numOLrzqt != null) {
                        break;
                        break;
                    }
                    int iCopydefault2 = EZpvd.copydefault();
                    if (numOLrzqt == null) {
                        objectRef2.element = stateListAnimatorEZpvd.fetchVPNInfo();
                    }
                    if (numOLrzqt != null) {
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref.ObjectRef objectRef4 = (Ref.ObjectRef) errorResponseDeserializer$deserialize$1.L$4;
                InterfaceC5095En.StateListAnimator stateListAnimator = (InterfaceC5095En.StateListAnimator) errorResponseDeserializer$deserialize$1.L$3;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) errorResponseDeserializer$deserialize$1.L$2;
                objectRef2 = (Ref.ObjectRef) errorResponseDeserializer$deserialize$1.L$1;
                InterfaceC5095En interfaceC5095En2 = (InterfaceC5095En) errorResponseDeserializer$deserialize$1.L$0;
                C56391yDq.AEQbTJ(obj);
                stateListAnimatorEZpvd = stateListAnimator;
                objectRef = objectRef5;
                T t = obj;
                objectRef4.element = t;
                interfaceC5095En = interfaceC5095En2;
                while (true) {
                    numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
                    int iCopydefault3 = copydefault.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        break;
                    }
                    int iCopydefault22 = EZpvd.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault22) {
                        if (numOLrzqt != null) {
                            break;
                        }
                        stateListAnimatorEZpvd.copydefault();
                    } else {
                        objectRef2.element = stateListAnimatorEZpvd.fetchVPNInfo();
                    }
                }
            }
        } catch (DeserializationException unused) {
            return null;
        }
    }
}

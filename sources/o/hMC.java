package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hMC {
    public static final Activity Companion = new Activity(null);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hMC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 1567036) {
                if (iHashCode != 1567067) {
                    if (iHashCode != 1567070) {
                        switch (iHashCode) {
                            case 1537215:
                                if (str.equals("2001")) {
                                    return C23274hvD.Fragment.ActivityResultLauncherHolder;
                                }
                                break;
                            case 1537216:
                                if (str.equals("2002")) {
                                    return C23274hvD.Fragment.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner2;
                                }
                                break;
                            case 1537217:
                                if (str.equals("2003")) {
                                    return C23274hvD.Fragment.findOwner;
                                }
                                break;
                            case 1537218:
                                if (str.equals("2004")) {
                                    return C23274hvD.Fragment.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner1;
                                }
                                break;
                            case 1537219:
                                if (str.equals("2005")) {
                                    return C23274hvD.Fragment.setLauncher;
                                }
                                break;
                            case 1537220:
                                if (str.equals("2006")) {
                                    return C23274hvD.Fragment.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner2;
                                }
                                break;
                            case 1537221:
                                if (str.equals("2007")) {
                                    return C23274hvD.Fragment.getLauncher;
                                }
                                break;
                            case 1537222:
                                if (str.equals("2008")) {
                                    return C23274hvD.Fragment.ViewTreeOnBackPressedDispatcherOwner;
                                }
                                break;
                            case 1537223:
                                if (str.equals("2009")) {
                                    return C23274hvD.Fragment.ActivityResultRegistryKtrememberLauncherForActivityResult1invokeinlinedonDispose1;
                                }
                                break;
                            default:
                                switch (iHashCode) {
                                    case 1537245:
                                        if (str.equals("2010")) {
                                            return C23274hvD.Fragment.ActivityResultRegistryKt;
                                        }
                                        break;
                                    case 1537246:
                                        if (str.equals("2011")) {
                                            return C23274hvD.Fragment.launch;
                                        }
                                        break;
                                    case 1537247:
                                        if (str.equals("2012")) {
                                            return C23274hvD.Fragment.ActivityComposeUtilsKt;
                                        }
                                        break;
                                    case 1537248:
                                        if (str.equals("2013")) {
                                            return C23274hvD.Fragment.ActivityResultRegistryKtrememberLauncherForActivityResult1;
                                        }
                                        break;
                                    default:
                                        switch (iHashCode) {
                                            case 1567010:
                                                if (str.equals("3005")) {
                                                    return C23274hvD.Fragment.ParcelableVolumeInfo;
                                                }
                                                break;
                                            case 1567011:
                                                if (str.equals("3006")) {
                                                    return C23274hvD.Fragment.MediaSessionCompatApi24CallbackProxy;
                                                }
                                                break;
                                            case 1567012:
                                                if (str.equals("3007")) {
                                                    return C23274hvD.Fragment.ParcelableVolumeInfo1;
                                                }
                                                break;
                                            case 1567013:
                                                if (str.equals("3008")) {
                                                    return C23274hvD.Fragment.INotificationSideChannelStubProxy;
                                                }
                                                break;
                                            default:
                                                switch (iHashCode) {
                                                    case 1567039:
                                                        if (str.equals("3013")) {
                                                            return C23274hvD.Fragment.MediaSessionCompatApi23CallbackProxy;
                                                        }
                                                        break;
                                                    case 1567040:
                                                        if (str.equals("3014")) {
                                                            return C23274hvD.Fragment.MediaSessionCompatApi23;
                                                        }
                                                        break;
                                                    case 1567041:
                                                        if (str.equals("3015")) {
                                                            return C23274hvD.Fragment.INotificationSideChannelStub;
                                                        }
                                                        break;
                                                    case 1567042:
                                                        if (str.equals("3016")) {
                                                            return C23274hvD.Fragment.INotificationSideChannelDefault;
                                                        }
                                                        break;
                                                    case 1567043:
                                                        if (str.equals("3017")) {
                                                            return C23274hvD.Fragment.getBufferedPosition;
                                                        }
                                                        break;
                                                    case 1567044:
                                                        if (str.equals("3018")) {
                                                            return C23274hvD.Fragment.MediaSessionCompatApi23Callback;
                                                        }
                                                        break;
                                                    case 1567045:
                                                        if (str.equals("3019")) {
                                                            return C23274hvD.Fragment.PlaybackStateCompat;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else if (str.equals("3023")) {
                        return C23274hvD.Fragment.MediaSessionCompatApi24Callback;
                    }
                } else if (str.equals("3020")) {
                    return C23274hvD.Fragment.MediaSessionCompatApi22;
                }
            } else if (str.equals("3010")) {
                return C23274hvD.Fragment.MediaSessionCompatApi24;
            }
        } else if (str.equals("0")) {
            return C23274hvD.Fragment.readTypedObject;
        }
        return -1;
    }
}

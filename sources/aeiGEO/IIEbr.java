package aeiGEO;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class IIEbr {
    public static int Eci = 9211;
    private static final int QNDbbU = 65535;
    public static int RPi = 1426;
    private static final IIEbr UcUFhW = new IIEbr();
    private static int gxVeVT = 10000;
    private final Map<String, Socket> DuevLZ = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private IIEbr() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static IIEbr uzCIH() {
        return UcUFhW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void addSocket(String str, int i, Socket socket) {
        this.DuevLZ.put(str + i, socket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void closeSocket(String str, int i) {
        synchronized (this) {
            Socket socket = this.DuevLZ.get(str + i);
            if (socket == null) {
                return;
            }
            try {
                socket.close();
            } catch (IOException unused) {
            }
            this.DuevLZ.remove(str + i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Socket hkDICb(String str, int i) throws IOException {
        Socket socket = this.DuevLZ.get(str + i);
        if (socket != null) {
            return socket;
        }
        Socket socket2 = new Socket();
        socket2.connect(new InetSocketAddress(str, i), gxVeVT);
        socket2.setSoTimeout(gxVeVT);
        this.DuevLZ.put(str + i, socket2);
        return socket2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[Catch: IOException -> 0x004c, UnknownHostException -> 0x0053, IllegalArgumentException -> 0x006e, all -> 0x00df, TRY_LEAVE, TryCatch #3 {IOException -> 0x004c, IllegalArgumentException -> 0x006e, UnknownHostException -> 0x0053, blocks: (B:6:0x000c, B:13:0x001b, B:15:0x0028, B:16:0x0041, B:17:0x0047), top: B:62:0x000c, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendSocketRequest(String str, int i, byte[] bArr, boolean z, TMXProfilingConnectionsInterface.TMXCallback tMXCallback) {
        int i2;
        InputStream inputStream;
        synchronized (this) {
            TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode = new TMXProfilingConnectionsInterface.TMXHttpResponseCode(-20);
            if (bArr != null) {
                try {
                    if (UPbYzn.iSpHlg(str) || i < 1 || i > 65535) {
                        tMXHttpResponseCode.setHttpResponseCode(-23);
                    } else {
                        Socket socketHkDICb = hkDICb(str, i);
                        socketHkDICb.getOutputStream().write(bArr);
                        if (z) {
                            socketHkDICb.close();
                            this.DuevLZ.remove(str + i);
                        } else {
                            inputStream = socketHkDICb.getInputStream();
                        }
                    }
                } catch (IOException unused) {
                    tMXHttpResponseCode.setHttpResponseCode(-22);
                } catch (IllegalArgumentException unused2) {
                    tMXHttpResponseCode.setHttpResponseCode(-23);
                    if ((Eci ^ 9211) != 0) {
                        if ((RPi ^ 1426) != 0) {
                            while (true) {
                                int i3 = RPi;
                                int i4 = i3 + 78;
                                if (i4 != 95) {
                                    if (i4 == 209) {
                                        RPi = (i3 * 29) + i3;
                                        break;
                                    } else if (i4 == 355) {
                                        RPi = ((i3 + i3) >> 67) * 71;
                                    }
                                } else {
                                    break;
                                }
                            }
                            while (true) {
                                RPi = (RPi * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) % 27;
                            }
                        } else {
                            while (true) {
                                int i5 = Eci;
                                int i6 = i5 + 65;
                                if (i6 == 88) {
                                    break;
                                }
                                if (i6 == 214) {
                                    Eci = (i5 % 47) ^ 4372;
                                    if (RPi <= 1425) {
                                        while (RPi + 104 != 29) {
                                        }
                                        while (true) {
                                            RPi = (RPi ^ 2120) * 518;
                                        }
                                    }
                                }
                            }
                            Eci = (Eci % 93) >> 107;
                        }
                    }
                } catch (UnknownHostException unused3) {
                    tMXHttpResponseCode.setHttpResponseCode(-21);
                    if ((RPi ^ 1426) != 0) {
                        do {
                            i2 = RPi;
                        } while (i2 + 65 != 73);
                        RPi = (i2 + i2) * 32;
                    }
                }
                inputStream = null;
            }
            if (tMXCallback != null) {
                tMXCallback.onComplete(tMXHttpResponseCode, inputStream);
            }
        }
    }
}

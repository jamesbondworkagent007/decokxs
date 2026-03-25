package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;
import o.C5574Wy;
import o.WB;
import o.WE;
import o.WI;

/* JADX INFO: loaded from: classes21.dex */
public class NioPathDeserializer extends StdScalarDeserializer<Path> {
    private static final boolean areWindowsFilePathsSupported;
    private static final long serialVersionUID = 1;

    static {
        File[] fileArrListRoots = File.listRoots();
        int length = fileArrListRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String path = fileArrListRoots[i].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i++;
        }
        areWindowsFilePathsSupported = z;
    }

    public NioPathDeserializer() {
        super((Class<?>) C5574Wy.EZpvd());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Path deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.copydefault(JsonToken.VALUE_STRING)) {
            return WB.cA_(deserializationContext.handleUnexpectedToken(C5574Wy.EZpvd(), jsonParser));
        }
        String strZLjUOn = jsonParser.zLjUOn();
        if (strZLjUOn.indexOf(58) < 0) {
            return Paths.get(strZLjUOn, new String[0]);
        }
        if (areWindowsFilePathsSupported && strZLjUOn.length() >= 2 && Character.isLetter(strZLjUOn.charAt(0)) && strZLjUOn.charAt(1) == ':') {
            return Paths.get(strZLjUOn, new String[0]);
        }
        try {
            URI uri = new URI(strZLjUOn);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e) {
                try {
                    String scheme = uri.getScheme();
                    Iterator it = ServiceLoader.load(WI.copydefault()).iterator();
                    while (it.hasNext()) {
                        FileSystemProvider fileSystemProviderCD_ = WE.cD_(it.next());
                        if (fileSystemProviderCD_.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProviderCD_.getPath(uri);
                        }
                    }
                    return WB.cA_(deserializationContext.handleInstantiationProblem(handledType(), strZLjUOn, e));
                } catch (Throwable th) {
                    th.addSuppressed(e);
                    return WB.cA_(deserializationContext.handleInstantiationProblem(handledType(), strZLjUOn, th));
                }
            } catch (Throwable th2) {
                return WB.cA_(deserializationContext.handleInstantiationProblem(handledType(), strZLjUOn, th2));
            }
        } catch (URISyntaxException e2) {
            return WB.cA_(deserializationContext.handleInstantiationProblem(handledType(), strZLjUOn, e2));
        }
    }
}

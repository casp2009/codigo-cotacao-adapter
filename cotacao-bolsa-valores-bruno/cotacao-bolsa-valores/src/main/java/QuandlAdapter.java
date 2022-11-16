import com.jimmoores.quandl.DataSetRequest;
import com.jimmoores.quandl.Row;
import com.jimmoores.quandl.classic.ClassicQuandlSession;

import java.time.format.DateTimeFormatter;

public class QuandlAdapter implements ServicoCotacao{
    @Override
    public Double getCotacao(String codEmpresa) {
        System.out.printf("Cotação da Empresa %s pelo serviço Quandl: http://quandl.com/%n", codEmpresa);
        var session = ClassicQuandlSession.create();
        var request = DataSetRequest.Builder
                .of(codEmpresa)
                .withMaxRows(1)
                .build();
        var tabularResult = session.getDataSet(request);
        Row row = tabularResult.get(0);

        assert row.getDouble("Close") != null;
        return row.getDouble("Close");
    }
}

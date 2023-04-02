package metier;

import dao.IDao;

public class MetierImpl implements Imetier{

    private IDao iDao;

    @Override
    public double calcul() {
        double data= iDao.getData();
        return data*11.4;
    }

    public void setDao(IDao iDao) {
        this.iDao = iDao;
    }
}

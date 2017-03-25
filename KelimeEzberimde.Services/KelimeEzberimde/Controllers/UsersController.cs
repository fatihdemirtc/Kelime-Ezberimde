using System.Collections.Generic;
using System.Linq;
using System.Web.Http;

namespace KelimeEzberimde.Controllers
{
    public class UsersController : ApiController
    {
        KelimeEzberimdeEntities db = new KelimeEzberimdeEntities();

        public void SaveUser(User posting)
        {
            db.Users.Add(posting);
            db.SaveChanges();
        }

        public IEnumerable<User> Get()
        {
            return db.Users.ToList();
        }
        public IEnumerable<User> Get(int id)
        {
            return db.Users.Where(x => x.Id == id);
        }

    }
}
